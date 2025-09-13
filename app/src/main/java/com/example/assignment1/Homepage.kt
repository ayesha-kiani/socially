package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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

        findViewById<ImageView>(R.id.nav_heart).setOnClickListener {
            startActivity(Intent(this, ActivityFollowing::class.java))
        }

        findViewById<ImageView>(R.id.nav_profile).setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }
        findViewById<ImageView>(R.id.nav_search).setOnClickListener {
            startActivity(Intent(this, Explorepage::class.java))
        }
        findViewById<ImageView>(R.id.nav_add).setOnClickListener {
            startActivity(Intent(this, Post::class.java))
        }
        findViewById<ImageView>(R.id.share_icon).setOnClickListener {
            startActivity(Intent(this, DMs::class.java))
        }
        findViewById<ImageView>(R.id.myStory).setOnClickListener {
            startActivity(Intent(this, Viewmyactivity::class.java))
        }

        findViewById<ImageView>(R.id.story1).setOnClickListener {
            startActivity(Intent(this, Viewstory::class.java))
        }
        findViewById<ImageView>(R.id.camera_nav_icon).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }


    }
}