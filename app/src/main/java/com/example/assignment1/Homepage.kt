package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val storiesRecyclerView = findViewById<RecyclerView>(R.id.stories_recycler)
        storiesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        val storiesList = listOf(
            StoryModel(R.drawable.oval, "Your Story"),
            StoryModel(R.drawable.oval, "Sara"),
            StoryModel(R.drawable.oval, "Fatima"),
            StoryModel(R.drawable.oval, "Zara"),
            StoryModel(R.drawable.oval, "Noor")
        )

        val adapter = StoriesAdapter(storiesList)
        storiesRecyclerView.adapter = adapter
        // Setup Posts RecyclerView (Vertical)
        val postsRecyclerView = findViewById<RecyclerView>(R.id.posts_recycler)
        postsRecyclerView.layoutManager = LinearLayoutManager(this) // vertical list

        val postsList = listOf(
            PostModel(
                profilePicRes = R.drawable.oval,
                username = "Ayesha Kiani",
                postImageRes = R.drawable.greece,
                likesText = "liked by sana and 400 others",
                caption = "Had a great hike across this beautiful landscape"
            ),
            PostModel(
                profilePicRes = R.drawable.oval,
                username = "Sara Ali",
                postImageRes = R.drawable.greece,
                likesText = "liked by amina and 150 others",
                caption = "Amazing sunrise at the beach"
            )
            // Add more posts as needed
        )
        val postsAdapter = HomepagePostAdapter(postsList)
        postsRecyclerView.adapter = postsAdapter
        findViewById<ImageView>(R.id.nav_search).setOnClickListener {
            startActivity(Intent(this, Explorepage::class.java))
        }
    }
}