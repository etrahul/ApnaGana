plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.apnagana.music"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.apnagana.music"
        minSdk = 24
        targetSdk = 34
        versionCode = 70
        versionName = "7.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":innertube"))
    implementation(project(":lrclib"))
    implementation(project(":kugou"))
    implementation(project(":betterlyrics"))
    implementation(project(":lastfm"))
    implementation(project(":shazamkit"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.session)
}
