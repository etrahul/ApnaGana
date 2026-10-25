package com.apnagana.betterlyrics

data class WordSyncToken(val word: String, val startMs: Long, val endMs: Long)

object BetterLyrics {
    fun interpolateWords(line: String, startMs: Long, endMs: Long): List<WordSyncToken> {
        val words = line.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }
        if (words.isEmpty()) return emptyList()
        val duration = (endMs - startMs).coerceAtLeast(300L)
        val step = duration / words.size
        return words.mapIndexed { idx, w ->
            WordSyncToken(w, startMs + idx * step, startMs + (idx + 1) * step)
        }
    }
}
