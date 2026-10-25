package com.apnagana.innertube

import kotlinx.serialization.Serializable

@Serializable
data class InnerTubeClient(
    val clientName: String,
    val clientVersion: String,
    val androidSdkVersion: Int? = null,
    val osName: String? = null,
    val osVersion: String? = null,
    val hl: String = "en",
    val gl: String = "IN"
) {
    companion object {
        val ANDROID_VR = InnerTubeClient(
            clientName = "ANDROID_VR",
            clientVersion = "1.60.19",
            androidSdkVersion = 34,
            osName = "Android",
            osVersion = "14"
        )
        val ANDROID_MUSIC = InnerTubeClient(
            clientName = "ANDROID_MUSIC",
            clientVersion = "7.27.52",
            androidSdkVersion = 34,
            osName = "Android",
            osVersion = "14"
        )
        val WEB_REMIX = InnerTubeClient(
            clientName = "WEB_REMIX",
            clientVersion = "1.20250310.01.00"
        )
    }
}
