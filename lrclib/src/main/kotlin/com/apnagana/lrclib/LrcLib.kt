package com.apnagana.lrclib

data class SyncedLyricLine(val timeMs: Long, val text: String)

object LrcLib {
    const val BASE_URL = "https://lrclib.net/api/search"

    fun parseLrc(rawLrc: String): List<SyncedLyricLine> {
        val regex = Regex("\\[(\\d{1,2}):(\\d{2})(?:\\.(\\d{1,3}))?\\](.*)")
        return rawLrc.lines().mapNotNull { line ->
            val match = regex.find(line) ?: return@mapNotNull null
            val min = match.groupValues[1].toLong()
            val sec = match.groupValues[2].toLong()
            val ms = match.groupValues[3].padEnd(3, '0').take(3).toLongOrNull() ?: 0L
            val text = match.groupValues[4].trim()
            if (text.isEmpty()) null else SyncedLyricLine(min * 60_000 + sec * 1_000 + ms, text)
        }
    }
}
