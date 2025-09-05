package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoriesAdapter(private val stories: List<StoryModel>) : RecyclerView.Adapter<StoriesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_stories, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentStory = stories[position]
        holder.storyPic.setImageResource(currentStory.storyPic)
        holder.userNameTextView.text = currentStory.userName
    }

    override fun getItemCount(): Int = stories.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storyPic: ImageView = itemView.findViewById(R.id.story_pic)
        val userNameTextView: TextView = itemView.findViewById(R.id.story_user_name)
    }
}
