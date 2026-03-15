package com.example.behealthyapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : androidx.appcompat.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSuivant = findViewById<Button>(R.id.btnNext)
// Affiche un Toast et lance ProfilActivity
        btnSuivant.setOnClickListener {
            Toast.makeText(this, "Bouton cliqué !", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, it::class.java)
            startActivity(intent)
        }
    }}