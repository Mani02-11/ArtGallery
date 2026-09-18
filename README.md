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

### Status

✅ **Passed**

### Screenshot

![Test Case 1](screenshots/test_case_1.png)

**Figure 2: Test Case 1 – Exhibition Selection**

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

### Status

✅ **Passed**

### Screenshot

![Test Case 2](screenshots/test_case_2.png)

**Figure 3: Test Case 2 – Artwork Details**

---

# 🧪 Test Case 3 – Add Artwork to Favorites

### Objective

To verify that clicking **ADD TO FAVORITES** generates an Android notification.

### Input

Open an artwork and click the **ADD TO FAVORITES** button.

### Expected Result

An Android notification should be displayed indicating that the artwork has been added to favorites.

Example:

```text
ArtGallery

Starry Night added to Favorites
```

### Actual Result

The favorite notification was generated successfully.

### Status

✅ **Passed**

### Screenshot

![Test Case 3](screenshots/test_case_3.png)

**Figure 4: Test Case 3 – Add to Favorites Notification**

---


### Screenshot Showing Name and USN

![Student Details](screenshots/student_details_usn.png)

**Figure 5: Application Output Showing Student Name and USN**

---

**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab  
**Experiment:** ArtGallery – Digital Exhibition
