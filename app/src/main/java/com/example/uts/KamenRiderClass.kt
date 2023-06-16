package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KamenRiderClass(
    val krimg: Int,
    val krname: String,
    val krdate: String,
    val krauthor: String,
    val krdesc: String,
    val krrate: String,
    val ratingbar: Double
) : Parcelable