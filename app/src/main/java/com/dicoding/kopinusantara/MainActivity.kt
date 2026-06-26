package com.dicoding.kopinusantara

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KOPI = "extra_kopi"
    }

    private lateinit var rvKopi: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        rvKopi = findViewById(R.id.rvKopi)
        rvKopi.layoutManager = LinearLayoutManager(this)

        val listKopi = KopiDataSource.getListKopi()
        val adapter = KopiAdapter(listKopi) { kopiDipilih ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(EXTRA_KOPI, kopiDipilih)
            startActivity(intent)
        }
        rvKopi.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
