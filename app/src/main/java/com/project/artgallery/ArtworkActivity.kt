package com.project.artgallery

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat

class ArtworkActivity : AppCompatActivity() {

    companion object {
        private const val CHANNEL_ID = "art_gallery_favorites_channel"
        private const val NOTIFICATION_ID = 1001
        private const val PERMISSION_REQUEST_CODE = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artwork)

        val ivLargeArtwork = findViewById<ImageView>(R.id.ivLargeArtwork)
        val tvArtworkTitle = findViewById<TextView>(R.id.tvArtworkTitle)
        val tvArtistName = findViewById<TextView>(R.id.tvArtistName)
        val tvCompleteDescription = findViewById<TextView>(R.id.tvCompleteDescription)
        val btnAddToFavorites = findViewById<Button>(R.id.btnAddToFavorites)

        val title = intent.getStringExtra("EXTRA_TITLE") ?: "Artwork Title"
        val artist = intent.getStringExtra("EXTRA_ARTIST") ?: "Artist Name"
        val description = intent.getStringExtra("EXTRA_DESCRIPTION") ?: "Complete description goes here."
        val imageRes = intent.getIntExtra("EXTRA_IMAGE", R.drawable.painting)

        tvArtworkTitle.text = title
        tvArtistName.text = artist
        tvCompleteDescription.text = "$description\n\nAdditional historical notes and exhibition details for $title by $artist. This piece represents a pinnacle of its respective era and medium."
        ivLargeArtwork.setImageResource(imageRes)

        createNotificationChannel()

        btnAddToFavorites.setOnClickListener {
            Toast.makeText(this, "Added to Favorites", Toast.LENGTH_SHORT).show()
            showFavoriteNotification(title)
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Favorites Notification"
            val descriptionText = "Notifications for artworks added to favorites"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    @SuppressLint("MissingPermission")
    private fun showFavoriteNotification(artworkTitle: String) {
        // Check POST_NOTIFICATIONS permission on Android 13+ (API 33+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                    PERMISSION_REQUEST_CODE
                )
                return
            }
        }

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_menu_agenda)
            .setContentTitle("ArtGallery")
            .setContentText("$artworkTitle added to Favorites")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)

        try {
            with(NotificationManagerCompat.from(this)) {
                notify(NOTIFICATION_ID, builder.build())
            }
        } catch (e: SecurityException) {
            e.printStackTrace()
        }
    }
}
