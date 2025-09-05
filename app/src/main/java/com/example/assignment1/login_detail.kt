package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_detail)
        findViewById<TextView>(R.id.signup_text).setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
        findViewById<Button>(R.id.login_btn).setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
        }
    }
}