package com.example.ratestar

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare UI elements
    private lateinit var ratingBar: RatingBar
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements by finding their respective IDs
        ratingBar = findViewById(R.id.ratingBar)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        // Set click listener for the button
        button.setOnClickListener {
            // Display the rating value inside the TextView when the button is clicked
            textView.text = buildString {
                append("You Rated : ")
                append(ratingBar.rating)
            }
        }
    }
}