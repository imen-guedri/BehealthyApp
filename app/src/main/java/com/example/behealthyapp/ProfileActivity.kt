package com.example.behealthyapp
import android.os.Bundle
import android.content.Intent
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btnRetour = findViewById<Button>(R.id.btnRetour)

        btnRetour.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}