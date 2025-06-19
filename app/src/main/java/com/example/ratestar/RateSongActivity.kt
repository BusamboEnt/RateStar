package com.example.ratestar

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RateSongActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_song)

        val ratingBar = findViewById<RatingBar>(R.id.rateBar)
        val tvDisplay = findViewById<TextView>(R.id.tvRated)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            tvDisplay.text = "You rated this: $rating stars"
        }
    }
}