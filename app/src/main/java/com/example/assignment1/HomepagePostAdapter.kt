package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomepagePostAdapter(private val posts: List<PostModel>) : RecyclerView.Adapter<HomepagePostAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_homepage_post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.profilePic.setImageResource(post.profilePicRes)
        holder.profileName.text = post.username
        holder.postImage.setImageResource(post.postImageRes)
        holder.postLikes.text = post.likesText   // use likesText, not post_likes
        holder.postDescription.text = post.caption

        holder.likePic.setImageResource(post.profilePicRes) // example usage
    }
    override fun getItemCount(): Int = posts.size

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profilePic: ImageView = itemView.findViewById(R.id.profile_pic)
        val profileName: TextView = itemView.findViewById(R.id.profile_name)
        val postImage: ImageView = itemView.findViewById(R.id.post_picture)
        val likeButton: ImageButton = itemView.findViewById(R.id.like_button)
        val commentButton: ImageButton = itemView.findViewById(R.id.comment_button)
        val shareButton: ImageButton = itemView.findViewById(R.id.share_button)
        val bookmarkButton: ImageButton = itemView.findViewById(R.id.bookmark_button)
        val postLikes: TextView = itemView.findViewById(R.id.post_likes)
        val postDescription: TextView = itemView.findViewById(R.id.post_description)
        val likePic: ImageView = itemView.findViewById(R.id.like_pic)
    }
}
