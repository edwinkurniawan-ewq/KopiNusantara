package com.dicoding.kopinusantara

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbarDetail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        val kopi: Kopi? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(MainActivity.EXTRA_KOPI, Kopi::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(MainActivity.EXTRA_KOPI)
        }

        val imgDetail: ImageView = findViewById(R.id.imgDetail)
        val tvNamaDetail: TextView = findViewById(R.id.tvNamaDetail)
        val tvAsalDetail: TextView = findViewById(R.id.tvAsalDetail)
        val tvDeskripsiDetail: TextView = findViewById(R.id.tvDeskripsiDetail)

        kopi?.let {
            imgDetail.setImageResource(it.imageRes)
            tvNamaDetail.text = it.nama
            tvAsalDetail.text = it.asalDaerah
            tvDeskripsiDetail.text = it.deskripsiLengkap
            title = it.nama
        }
    }
}
