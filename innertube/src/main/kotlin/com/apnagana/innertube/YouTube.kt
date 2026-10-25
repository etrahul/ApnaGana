package com.apnagana.innertube

/**
 * ApnaGana InnerTube Extractor Module (modeled on Metrolist :innertube)
 * Reverse-engineers YouTube Music internal youtubei/v1 endpoints for ad-free 140/251 audio streams.
 */
object YouTube {
    const val MUSIC_HOST = "https://music.youtube.com/youtubei/v1"
    const val VIDEO_HOST = "https://www.youtube.com/youtubei/v1"

    fun buildPlayerPayload(videoId: String, client: InnerTubeClient = InnerTubeClient.ANDROID_VR): String {
        return """
        {
          "context": {
            "client": {
              "clientName": "${client.clientName}",
              "clientVersion": "${client.clientVersion}",
              "hl": "${client.hl}",
              "gl": "${client.gl}"
            }
          },
          "videoId": "$videoId",
          "contentCheckOk": true,
          "racyCheckOk": true
        }
        """.trimIndent()
    }
}
