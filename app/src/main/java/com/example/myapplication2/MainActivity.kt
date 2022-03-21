package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textid : TextView
    private lateinit var btnclick : Button
    private lateinit var btnreset : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textid = findViewById(R.id.textid)       //Declaring the relationship between ids and buttons
        btnclick = findViewById(R.id.btnid)
        btnreset = findViewById(R.id.btnresetid)

        var clicked = 0                          // Declaring the variable to adjust click count

        btnclick.setOnClickListener{
            clicked += 1                         //Declaring listeners so we can change the text value
            textid.text = clicked.toString()
        }
        btnreset.setOnClickListener{
            clicked = 0                          // Changes the value to 0 to reset the text value
            textid.text = clicked.toString()
        }
    }
}