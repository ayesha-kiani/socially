package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Explorepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explorepage)

        findViewById<ImageView>(R.id.nav_home).setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
        }
        findViewById<EditText>(R.id.search_bar).setOnClickListener {
            startActivity(Intent(this, Searchprofile::class.java))
        }
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

    }
}