package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.text.Highlights
import android.widget.ImageView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        findViewById<ImageView>(R.id.nav_heart).setOnClickListener {
            startActivity(Intent(this, ActivityFollowing::class.java))
        }


        findViewById<ImageView>(R.id.nav_search).setOnClickListener {
            startActivity(Intent(this, Explorepage::class.java))
        }
        findViewById<ImageView>(R.id.nav_add).setOnClickListener {
            startActivity(Intent(this, Post::class.java))
        }
        findViewById<ImageView>(R.id.nav_home).setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
        }
        findViewById<ImageView>(R.id.highlight1).setOnClickListener {
            startActivity(Intent(this, com.example.assignment1.Highlights::class.java))
        }
        findViewById<ImageView>(R.id.highlight2).setOnClickListener {
            startActivity(Intent(this, com.example.assignment1.Highlights::class.java))
        }
        findViewById<ImageView>(R.id.highlight3).setOnClickListener {
            startActivity(Intent(this, com.example.assignment1.Highlights::class.java))
        }

        findViewById<Button>(R.id.edit_profile_btn).setOnClickListener {
            startActivity(Intent(this, EditProfile::class.java))
        }

    }
}