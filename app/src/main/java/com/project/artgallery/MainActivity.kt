package com.project.artgallery

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivityLifecycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
        setContentView(R.layout.activity_main)

        val btnPaintings = findViewById<Button>(R.id.btnPaintings)
        val btnSculptures = findViewById<Button>(R.id.btnSculptures)
        val btnPhotography = findViewById<Button>(R.id.btnPhotography)

        btnPaintings.setOnClickListener {
            openExhibitionFragment("Paintings")
        }

        btnSculptures.setOnClickListener {
            openExhibitionFragment("Sculptures")
        }

        btnPhotography.setOnClickListener {
            openExhibitionFragment("Photography")
        }
    }

    private fun openExhibitionFragment(category: String) {
        val fragment = ExhibitionFragment().apply {
            arguments = Bundle().apply {
                putString("CATEGORY_KEY", category)
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}
