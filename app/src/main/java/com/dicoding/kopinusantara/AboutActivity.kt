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

        tvNama.text = "Edwin KUrniawan Eka Julianda"
        tvEmail.text = "edwinkurniawan9326@gmail.com"
    }
}
