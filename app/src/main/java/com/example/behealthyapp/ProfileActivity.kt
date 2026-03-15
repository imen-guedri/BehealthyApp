package com.example.behealthyapp
import android.os.Bundle
import android.content.Intent
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val btnCatalogue = findViewById<Button>(R.id.btnC)
        btnCatalogue.setOnClickListener {
            val intent = Intent(this, it::class.java)
            startActivity(intent)
        }
    }
}