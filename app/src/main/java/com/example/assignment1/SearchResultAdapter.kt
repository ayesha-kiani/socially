package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchResultAdapter(
    private val items: List<SearchResult>
) : RecyclerView.Adapter<SearchResultAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val circleImage: ImageView = itemView.findViewById(R.id.circleImage)
        val initialsText: TextView = itemView.findViewById(R.id.initialsText)
        val hashText: TextView = itemView.findViewById(R.id.hashText)
        val title: TextView = itemView.findViewById(R.id.title)
        val subtitle: TextView = itemView.findViewById(R.id.subtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.activity_item_search_result, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.subtitle.text = item.subtitle ?: ""

        when (item.type) {
            ItemType.PROFILE -> {
                // Set blue circle background
                holder.circleImage.setImageResource(R.drawable.circle_blue)
                holder.initialsText.visibility = View.VISIBLE
                holder.initialsText.text = item.initials ?: ""
                holder.hashText.visibility = View.GONE
            }
            ItemType.HASHTAG -> {
                // Set circle with border background
                holder.circleImage.setImageResource(R.drawable.circle_border)
                holder.initialsText.visibility = View.GONE
                holder.hashText.visibility = View.VISIBLE
            }
            ItemType.PLACE -> {
                holder.circleImage.setImageResource(R.drawable.circle_border)
                holder.initialsText.visibility = View.GONE
                holder.hashText.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int = items.size
}
