package com.example.ratestar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapp.model.PlaylistItem

class ViewRatingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_ratings)

        val playlist = intent.getParcelableArrayListExtra<PlaylistItem>("playlist")
        val textView = findViewById<TextView>(R.id.tvRatings)
        val builder = StringBuilder()
        playlist?.forEach {
            builder.append("🎤 ${it.artist} - 🎵 ${it.song}\n⭐ Rating: ${it.rating}\n🗨 Comment: ${it.comment}\n\n")
        }
        textView.text = builder.toString()
    }
}