# ArtGallery – Digital Exhibition 🎨

## 📱 About the Project

ArtGallery is a simple Android application developed using **Kotlin and XML** as part of a **Mobile Application Development (MAD) Lab** project.

The application allows users to explore artworks from different categories such as **Paintings, Sculptures, and Photography**. Users can view artwork details and add artworks to their favorites.

When an artwork is added to favorites, an Android notification is displayed.

---

## ✨ Features

- 🎨 Browse Paintings
- 🗿 Browse Sculptures
- 📷 Browse Photography
- 🖼️ View artwork images
- 👨‍🎨 View artist information
- 📖 View artwork descriptions
- ⭐ Add artwork to Favorites
- 🔔 Receive Android notifications
- 🔄 Activity lifecycle demonstration
- 🔄 Fragment lifecycle demonstration
- 📝 Logcat lifecycle logging

---

## 🛠️ Technologies Used

- Kotlin
- XML
- Android Studio
- Android SDK
- AndroidX
- AppCompat
- Fragment
- Intent
- Bundle
- NotificationManager


---

## 🏗️ Project Structure

```text
ArtGallery/
│
├── app/
│   └── src/
│       └── main/
│           │
│           ├── java/com/example/artgallery/
│           │   ├── MainActivity.kt
│           │   ├── ExhibitionFragment.kt
│           │   └── ArtworkActivity.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_main.xml
│           │   │   ├── fragment_exhibition.xml
│           │   │   └── activity_artwork.xml
│           │   │
│           │   ├── drawable/
│           │   │   ├── starry_night.png
│           │   │   ├── david.png
│           │   │   └── photography.png
│           │   │
│           │   └── values/
│           │       ├── strings.xml
│           │       ├── colors.xml
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
└── build.gradle.kts
