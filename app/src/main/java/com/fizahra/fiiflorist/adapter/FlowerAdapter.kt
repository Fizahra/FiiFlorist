package com.fizahra.fiiflorist.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fizahra.fiiflorist.DetailActivity
import com.fizahra.fiiflorist.R
import com.fizahra.fiiflorist.model.Flower

class ListFlowerAdapter(private var data: List<Flower> = Flower.loadData()) : RecyclerView.Adapter<ListFlowerAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_flowers, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, shortdesc, photo) = data[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = shortdesc
        holder.itemView.setOnClickListener {
            val detailIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            detailIntent.putExtra("key_flower", data[holder.adapterPosition])
            holder.itemView.context.startActivity(detailIntent)
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.image_flower)
        val tvName: TextView = itemView.findViewById(R.id.tv_nama_flower)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_short_desc)
    }

}