package com.project.artgallery

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ExhibitionFragment : Fragment() {

    companion object {
        private const val TAG = "ExhibitionFragmentLifecycle"
    }

    private var category: String = "Paintings"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
        arguments?.let {
            category = it.getString("CATEGORY_KEY", "Paintings")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView() called")
        return inflater.inflate(R.layout.fragment_exhibition, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated() called")

        val tvCategory = view.findViewById<TextView>(R.id.tvCategory)
        val ivArtwork = view.findViewById<ImageView>(R.id.ivArtwork)
        val tvArtworkTitle = view.findViewById<TextView>(R.id.tvArtworkTitle)
        val tvArtistName = view.findViewById<TextView>(R.id.tvArtistName)
        val tvDescription = view.findViewById<TextView>(R.id.tvDescription)
        val btnViewArtwork = view.findViewById<Button>(R.id.btnViewArtwork)

        tvCategory.text = "Theme: $category"

        val title: String
        val artist: String
        val description: String
        val imageRes: Int

        when (category) {
            "Sculptures" -> {
                title = "Bust of Nefertiti"
                artist = "Thutmose (c. 1345 BC)"
                description = "An iconic painted stucco-coated limestone bust of Nefertiti, the Great Royal Wife of the Egyptian pharaoh Akhenaten, featuring her famous flat-topped blue crown."
                imageRes = R.drawable.sculpture
            }
            "Photography" -> {
                title = "Glass Terrarium"
                artist = "Botanical Photographer"
                description = "A beautiful close-up macro photograph of a glass terrarium filled with vibrant green succulents, capturing soft, natural light and delicate textures."
                imageRes = R.drawable.photography
            }
            else -> { // Paintings
                title = "Autumn Stroll"
                artist = "Impressionist Painter"
                description = "A highly textured, colorful impressionistic painting depicting a lone figure with a green umbrella walking down a tree-lined path amidst falling golden leaves."
                imageRes = R.drawable.painting
            }
        }

        tvArtworkTitle.text = title
        tvArtistName.text = artist
        tvDescription.text = description
        ivArtwork.setImageResource(imageRes)

        btnViewArtwork.setOnClickListener {
            val intent = Intent(requireContext(), ArtworkActivity::class.java).apply {
                putExtra("EXTRA_TITLE", title)
                putExtra("EXTRA_ARTIST", artist)
                putExtra("EXTRA_DESCRIPTION", description)
                putExtra("EXTRA_IMAGE", imageRes)
            }
            startActivity(intent)
        }
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}
