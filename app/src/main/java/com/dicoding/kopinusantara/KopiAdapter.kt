package com.dicoding.kopinusantara

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KopiAdapter(
    private val listKopi: List<Kopi>,
    private val onItemClick: (Kopi) -> Unit
) : RecyclerView.Adapter<KopiAdapter.KopiViewHolder>() {

    class KopiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgKopi: ImageView = itemView.findViewById(R.id.imgKopi)
        val tvNamaKopi: TextView = itemView.findViewById(R.id.tvNamaKopi)
        val tvAsalKopi: TextView = itemView.findViewById(R.id.tvAsalKopi)
        val tvDeskripsiSingkat: TextView = itemView.findViewById(R.id.tvDeskripsiSingkat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KopiViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kopi, parent, false)
        return KopiViewHolder(view)
    }

    override fun onBindViewHolder(holder: KopiViewHolder, position: Int) {
        val kopi = listKopi[position]
        holder.imgKopi.setImageResource(kopi.imageRes)
        holder.tvNamaKopi.text = kopi.nama
        holder.tvAsalKopi.text = kopi.asalDaerah
        holder.tvDeskripsiSingkat.text = kopi.deskripsiSingkat

        holder.itemView.setOnClickListener {
            onItemClick(kopi)
        }
    }

    override fun getItemCount(): Int = listKopi.size
}
