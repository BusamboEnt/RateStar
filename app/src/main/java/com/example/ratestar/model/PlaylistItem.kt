package com.example.ratestar.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlaylistItem (
    val artist: String,
    val song: String,
    var rating: Float,
    var comment: String
    ) : Parcelable