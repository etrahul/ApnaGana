package com.apnagana.lastfm

object LastFm {
    const val API_ROOT = "https://ws.audioscrobbler.com/2.0/"
    fun buildScrobbleParams(artist: String, track: String, timestampSec: Long): Map<String, String> =
        mapOf(
            "method" to "track.scrobble",
            "artist" to artist,
            "track" to track,
            "timestamp" to timestampSec.toString()
        )
}
