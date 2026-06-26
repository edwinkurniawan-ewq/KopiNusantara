package com.dicoding.kopinusantara

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Kopi(
    val id: Int,
    val nama: String,
    val asalDaerah: String,
    val deskripsiSingkat: String,
    val deskripsiLengkap: String,
    val imageRes: Int
) : Parcelable
