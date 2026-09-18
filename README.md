# ArtGallery – Digital Exhibition
---

## 👨‍💻 Student Details

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab  

---


---

## 📖 Description

This experiment demonstrates the implementation of **Activities, Fragments, Basic Views, Intents, Bundles, Notifications, and Lifecycle Methods** using Kotlin and XML.

The application provides a digital art exhibition where users can select an exhibition category, view artwork information, open detailed artwork information, and add an artwork to their favorites.

The application also demonstrates Activity and Fragment lifecycle callbacks, which can be observed through **Android Studio Logcat**.

### Scenario

The application simulates a **Digital Art Exhibition System**.

```text
ArtGallery – Digital Exhibition
              ↓
       Select Exhibition
              ↓
    ┌─────────┼─────────┐
    ↓         ↓         ↓
Paintings  Sculptures  Photography
    ↓         ↓         ↓
       Exhibition Fragment
              ↓
        View Artwork
              ↓
       Artwork Activity
              ↓
      Add to Favorites
              ↓
     Android Notification
```

---


## 🚀 Features

- 🎨 Digital Art Gallery interface
- 🖼️ Paintings exhibition
- 🗿 Sculptures exhibition
- 📷 Photography exhibition
- 📱 Fragment-based exhibition screen
- 🔗 Intent-based navigation
- 📦 Bundle for passing category information
- 🖼️ Artwork image display
- 📖 Artwork description
- ❤️ Add to Favorites option
- 🔔 Android notification
- 🔄 Activity lifecycle demonstration
- 🔄 Fragment lifecycle demonstration
- 📝 Logcat lifecycle verification
- 📱 Scrollable interface
- 🎓 Student Name and USN included

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Android Studio | Application Development |
| Kotlin | Programming Language |
| XML | User Interface Design |
| Android SDK | Android Development |
| Activity | Application Screens |
| Fragment | Exhibition Screen |
| Intent | Activity Navigation |
| Bundle | Passing Data to Fragment |
| TextView | Display Text |
| ImageView | Display Artwork |
| Button | User Actions |
| ScrollView | Scrollable Interface |
| NotificationManager | Android Notifications |
| Logcat | Lifecycle Monitoring |

---

# 📂 Project Structure

```text
ArtGallery
│
├── app
│   │
│   └── src
│       │
│       └── main
│           │
│           ├── java
│           │   └── com
│           │       └── example
│           │           └── artgallery
│           │               │
│           │               ├── MainActivity.kt
│           │               ├── ExhibitionFragment.kt
│           │               └── ArtworkActivity.kt
│           │
│           ├── res
│           │   │
│           │   ├── drawable
│           │   │   ├── sculpture.jpeg
│           │   │   ├── painting.jpeg
│           │   │   └── photography.jpg
│           │   │
│           │   ├── layout
│           │   │   ├── activity_main.xml
│           │   │   ├── fragment_exhibition.xml
│           │   │   └── activity_artwork.xml
│           │   │
│           │   └── values
│           │       └── strings.xml
│           │
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

# 📄 Description of Important Files

| File | Purpose |
|---|---|
| `MainActivity.kt` | Displays exhibition categories and opens the Fragment |
| `ExhibitionFragment.kt` | Displays artwork according to the selected category |
| `ArtworkActivity.kt` | Displays detailed artwork and handles favorites |
| `activity_main.xml` | Main Activity UI |
| `fragment_exhibition.xml` | Exhibition Fragment UI |
| `activity_artwork.xml` | Artwork details UI |
| `starry_night.png` | Painting artwork image |
| `david.png` | Sculpture artwork image |
| `photography.png` | Photography artwork image |
| `AndroidManifest.xml` | Declares Activities and notification permission |
| `strings.xml` | Application string resources |
| `README.md` | Experiment documentation |

---

# 🎨 User Interface

The application contains a digital exhibition interface with:

- ART GALLERY heading
- Digital Exhibition subtitle
- Exhibition category selection
- Paintings button
- Sculptures button
- Photography button
- Artwork image
- Artist name
- Artwork title
- Artwork description
- View Artwork button
- Add to Favorites button

---


# 🧪 Test Cases

## Test Case 1 – Application Launch and Exhibition Selection 

### Objective

To verify that the application launches successfully and allows the user to select an exhibition category.

### Input

Launch the application and select **Paintings**.

### Expected Result

The main screen should be displayed successfully. After selecting Paintings, the Exhibition Fragment should display the selected artwork and its information.

### Actual Result

The application launched successfully and the Paintings exhibition was displayed.


### Screenshot Showing Name and USN

<img width="400" height="660" alt="1000169047" src="https://github.com/user-attachments/assets/650ee40b-3285-4d78-a22f-28203a452336" />

---

# 🧪 Test Case 2 – View Artwork Details

### Objective

To verify that the selected artwork can be opened in a separate Activity using an Intent.

### Input

Select an exhibition and click the **VIEW ARTWORK** button.

### Expected Result

The `ArtworkActivity` should open and display the artwork image, title, artist, and description.

### Actual Result

The Artwork Activity opened successfully and displayed the selected artwork details.

### Screenshot

<img width="400" height="660" alt="1000169048" src="https://github.com/user-attachments/assets/0c28a9b8-4b10-4c0b-872a-a4f5fea8019b" />


---

# 🧪 Test Case 3 – Add Artwork to Favorites

### Objective

To verify that clicking **ADD TO FAVORITES** generates an Android notification.

### Input

Open an artwork and click the **ADD TO FAVORITES** button.

### Expected Result

An Android notification should be displayed indicating that the artwork has been added to favorites.

### Actual Result

The favorite notification was generated successfully.

### Status

✅ **Passed**

### Screenshot

<img width="400" height="660" alt="1000169049" src="https://github.com/user-attachments/assets/ce8c772f-95ba-4082-bddc-a6b2bfd60d1d" />

<img width="400" height="660" alt="1000169050" src="https://github.com/user-attachments/assets/bc756978-0631-4b2a-bcef-453fd94f5a11" />




**Subject:** Mobile Application Development Lab  
**Experiment:** ArtGallery – Digital Exhibition
