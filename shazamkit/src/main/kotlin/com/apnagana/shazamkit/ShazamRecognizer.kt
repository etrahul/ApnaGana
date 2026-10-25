package com.apnagana.shazamkit

data class RecognizedSong(val title: String, val artist: String, val youtubeQuery: String)

object ShazamRecognizer {
    fun buildSearchQuery(title: String, artist: String): String = "$title $artist official audio"
}
