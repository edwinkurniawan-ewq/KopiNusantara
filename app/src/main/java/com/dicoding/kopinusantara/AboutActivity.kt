package com.dicoding.kopinusantara

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbarAbout)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        // TODO: Ganti dua baris di bawah ini dengan nama dan email
        // yang TERDAFTAR DI AKUN DICODING kamu sebelum submit.
        val tvNama: TextView = findViewById(R.id.tvNamaProfil)
        val tvEmail: TextView = findViewById(R.id.tvEmailProfil)

        tvNama.text = "Nama Lengkap Anda"
        tvEmail.text = "email_dicoding_anda@example.com"

        // Foto profil sementara menggunakan ic_person (vector).
        // Kamu bisa menggantinya dengan foto asli:
        // 1. Copy file foto (misal: foto_profil.jpg) ke folder res/drawable
        // 2. Ganti src ImageView di activity_about.xml -> android:src="@drawable/foto_profil"
    }
}
