package com.example.ratestar

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapp.model.PlaylistItem

class PlaylistActivity : AppCompatActivity() {
    private val playlist = mutableListOf<PlaylistItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val artistInput = findViewById<EditText>(R.id.etArtist)
        val songInput = findViewById<EditText>(R.id.etSong)
        val ratingInput = findViewById<RatingBar>(R.id.ratingBar)
        val commentInput = findViewById<EditText>(R.id.etComment)

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val item = PlaylistItem(
                artistInput.text.toString(),
                songInput.text.toString(),
                ratingInput.rating,
                commentInput.text.toString()
            )
            playlist.add(item)
            Toast.makeText(this, "Added!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnViewRatings).setOnClickListener {
            val intent = Intent(this, ViewRatingsActivity::class.java)
            intent.putParcelableArrayListExtra("playlist", ArrayList(playlist))
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnRate).setOnClickListener {
            startActivity(Intent(this, RateSongActivity::class.java))
        }
    }
}