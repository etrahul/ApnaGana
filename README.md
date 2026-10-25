# 🎵 ApnaGana — *"Your Music, Your Vibe."*

**Package Name:** `com.apnagana.music`  
**Architecture:** Multi-Module Metrolist Architecture + Pro 5-Band Equalizer & Hybrid Engine  
**Design Theme:** Dark Theme (`#090614`) with Purple (`#a855f7`), Blue (`#3b82f6`), and Pink (`#ec4899`) Gradients

---

## 📂 Project Modules (Metrolist Structure + Pro Enhancements)

| Module / Folder | Role in ApnaGana |
| :--- | :--- |
| **`app/`** | Main Android application (`com.apnagana.music`), Material 3 Dark Purple-Blue-Pink Gradient UI, MediaSession background audio, 5-Band Equalizer, and Listen Together rooms |
| **`innertube/`** | Reverse-engineered YouTube Music internal API (`youtubei/v1/player` & `youtubei/v1/search`) using `ANDROID_VR`, `ANDROID_MUSIC`, `IOS`, and `WEB_REMIX` clients |
| **`lrclib/`** | Fetches time-synced `.lrc` lyrics from `lrclib.net` |
| **`kugou/`** | Secondary fallback synced lyrics engine for regional & Asian tracks |
| **`betterlyrics/`** | Word-by-word / syllable-synced Apple-Music-style karaoke lyrics |
| **`lastfm/`** | Automatic Last.fm track scrobbling and Now Playing status |
| **`shazamkit/`** | Audio fingerprinting & voice/lyric song recognition |
| **`fastlane/`** | F-Droid / Play Store release metadata & changelogs |
| **`.github/workflows/build-apk.yml`** | Automated GitHub Actions CI/CD that builds & signs **`ApnaGana.apk`** |

---

## 🚀 How to Build `ApnaGana.apk` on GitHub

1. Create a new GitHub repository named **`ApnaGana`**.
2. Extract **`ApnaGana.zip`** and push all files (or upload `my_music.html`, `logo.png`, and `.github/workflows/build-apk.yml`).
3. Open the **Actions** tab on GitHub and run **Build ApnaGana Android APK**.
4. Download your signed **`ApnaGana-Android-APK`** from the workflow Artifacts!
