ArtGallery – Digital Exhibition 🎨

A simple Android application developed using Kotlin and XML for a Mobile Application Development (MAD) lab project.

📱 About the Project

ArtGallery is a digital exhibition app that allows users to explore artworks from different categories such as Paintings, Sculptures, and Photography.

Users can select an exhibition category, view artwork details, and add an artwork to their favorites. A notification is displayed when an artwork is added to favorites.

✨ Features
🎨 Paintings exhibition
🗿 Sculptures exhibition
📷 Photography exhibition
🖼️ Artwork image display
👨‍🎨 Artist and artwork information
📖 Detailed artwork description
⭐ Add artwork to Favorites
🔔 Android notification
🔄 Activity lifecycle demonstration
🔄 Fragment lifecycle demonstration
📝 Logcat lifecycle logging
🛠️ Technologies Used
Kotlin
XML
Android Studio
Android SDK
AndroidX
AppCompat
Fragments
Intents
Bundles
NotificationManager
Logcat
📂 Project Structure
ArtGallery/
│
├── app/
│   └── src/
│       └── main/
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
🔄 Application Flow
                    ArtGallery
                        │
                        ▼
                 MainActivity
                        │
          ┌─────────────┼─────────────┐
          ▼             ▼             ▼
      Paintings     Sculptures    Photography
          │             │             │
          └─────────────┼─────────────┘
                        ▼
              ExhibitionFragment
                        │
                        ▼
                  View Artwork
                        │
                        ▼
                ArtworkActivity
                        │
                        ▼
               Add to Favorites
                        │
                        ▼
                   🔔 Notification
🖼️ Sample Artworks
Category	Artwork	Artist
Paintings	Starry Night	Vincent van Gogh
Sculptures	David	Michelangelo
Photography	Nature Photography	Digital Photography
🧩 Android Components
Activity

The project contains two activities:

MainActivity.kt
ArtworkActivity.kt
Fragment

ExhibitionFragment.kt is used to dynamically display the selected exhibition category.

Intent

An Intent is used to navigate from the Fragment to ArtworkActivity and transfer artwork information.

Bundle

A Bundle is used to pass the selected exhibition category to the Fragment.

Views

The application uses:

TextView
ImageView
Button
ScrollView
LinearLayout
FrameLayout
Notification

NotificationManager and NotificationChannel are used to display a notification when an artwork is added to favorites.

Lifecycle

The application demonstrates important lifecycle methods:

onCreate()
onStart()
onResume()
onPause()
onStop()
onDestroy()

Lifecycle events are logged using Log.d() and can be viewed in Android Studio Logcat.

🧪 Testing
1. Select Exhibition
Open Application
      ↓
Select Paintings / Sculptures / Photography
      ↓
ExhibitionFragment opens
2. View Artwork
Click "VIEW ARTWORK"
      ↓
ArtworkActivity opens
      ↓
Artwork details are displayed
3. Add to Favorites
Click "ADD TO FAVORITES"
      ↓
Toast message appears
      ↓
Android notification appears
4. Check Lifecycle

Open Logcat and search for:

MainActivity
ExhibitionFragment

Lifecycle callback messages can be observed.

🚀 How to Run
Clone or download this repository.
Open the project in Android Studio.
Wait for Gradle synchronization to complete.
Connect an Android device or start an emulator.
Click Run ▶.
Select an exhibition category and test the application flow.
