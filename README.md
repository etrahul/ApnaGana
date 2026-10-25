# 🎵 ApnaGana — *"Your Music, Your Vibe."*

[](#)
[](#)
[](#)
[](#license)

**ApnaGana** (*"Your Music, Your Vibe."*) is an open-source, ad-free YouTube Music & 320kbps HD music client for **Android** and **Web**, engineered with the multi-module and enhanced with a **Pro 5-Band Equalizer & Bass Boost DSP**, **Real-Time Listen Together Rooms**, and a signature **Dark Purple, Blue & Pink Gradient** interface.

---

## 🎨 Brand & Project Identity

| Property | Specification |
| :--- | :--- |
| **App Name** | `ApnaGana` |
| **Tagline** | *"Your Music, Your Vibe."* |
| **Android Package ID** | `com.apnagana.music` |
| **Primary Theme** | Dark (`#090614` / `#140d26`) with Purple (`#a855f7`), Blue (`#3b82f6`), and Pink (`#ec4899`) Gradients |
| **Supported Platforms** | Android 7.0+ (`minSdk 24` – `targetSdk 34`) & Modern Web Browsers |

---

## ✨ Key Features

1. **⚡ InnerTube Direct Audio Engine (`:innertube`)**
   - Reverse-engineers YouTube Music's internal `youtubei/v1/player` and `youtubei/v1/search` endpoints using `ANDROID_VR`, `ANDROID_MUSIC`, `IOS`, and `WEB_REMIX` client profiles.
   - Extracts direct `audio/mp4` (`itag=140`) and `audio/webm` (`itag=251`) streams with zero ads and full background/screen-off playback.
   - Combines YouTube Music catalog streams with **320kbps HD** audio streams and infinite **+50 More Songs** pagination.

2. **🎤 Multi-Provider Synced & Karaoke Lyrics (`:lrclib` + `:kugou` + `:betterlyrics`)**
   - Tap the album art in **Now Playing** to flip the 3D card and view time-synced lyrics fetched from **LRCLIB** with automatic fallback to **KuGou** and word-by-word **BetterLyrics** interpolation.
   - Tap any lyric line to jump directly to that timestamp, or customize lyrics with the built-in editor.

3. **🎚️ Pro 5-Band Equalizer & Bass Boost (Web Audio DSP)**
   - Dedicated 5-band equalizer (`60Hz Sub-Bass`, `230Hz Punch`, `910Hz Mids`, `3.6kHz Presence`, `14kHz Air HD`) with 1-tap presets: **ApnaGana Vibe**, **Bass Extreme**, **DJ Dholki Boost**, **Clear Vocal**, and **Flat**.

4. **🔍 ShazamKit Audio Recognizer (`:shazamkit`)**
   - Identify songs playing around you or match a short lyric phrase from the top app bar and play the matched track immediately.

5. **👥 Listen Together (Real-Time WebRTC Sync Rooms)**
   - Host a room (`AG-XXXX`) or join a friend's room from anywhere to synchronize playback, seek positions, track changes, live chat, and emoji reactions (`🔥 ❤️ 🎧 ✨`) in real time.

6. **📚 Metrolist Material 3 UI & Library Management**
   - **Home Screen:** Mood filter chips, horizontal 4-row paged **Quick picks**, and 3-column **Speed dial** artist/hit cards.
   - **Search Screen:** Live YouTube Music search with persistent recent search history (`✕` delete and `↖` quick-fill).
   - **Library Screen:** 2×2 collection cards (**Liked**, **Downloaded**, **Cached**, **My Top 50**), unlimited custom playlists, local phone MP3 import, and 1-click **`.json` Backup & Restore**.

7. **📻 Last.fm Scrobbling & Android Auto MediaSession (`:lastfm`)**
   - Broadcasts track metadata, album art, and play/pause/next/previous controls to Android lock-screen notifications, Bluetooth headsets, and Android Auto.

---

## 📄 License

Licensed under the **GNU General Public License v3.0 (GPL-3.0)**.  
Built with ❤️ for music lovers — **ApnaGana: *"Your Music, Your Vibe."***
