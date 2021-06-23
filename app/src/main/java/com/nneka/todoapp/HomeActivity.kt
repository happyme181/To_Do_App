package com.nneka.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay:TextView
    private lateinit var profileButton: Button
    private lateinit var newButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)
        profileButton = findViewById(R.id.profileButton)
        newButton = findViewById(R.id.newButton)


        usernameDisplay.text = intent.getStringExtra("name")

        profileButton.setOnClickListener{
            openProfilePage()
        }

        newButton.setOnClickListener {
            openNewPage()
        }

    }
    private fun openProfilePage(){
        val myIntent = Intent (this, ProfileActivity::class.java)
        startActivity(myIntent)
    }

    private fun openNewPage(){
        val intent = Intent (this, NewActivity::class.java)
        startActivity(intent)
    }

}