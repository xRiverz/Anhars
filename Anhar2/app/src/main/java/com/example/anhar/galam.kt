package com.example.anhar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class galam : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galam)

            setContentView(R.layout.galam)

            //get data from intent
            val intent = intent
            val name = intent.getStringExtra("Name")
            val loc = intent.getStringExtra("Location")
            val pho = intent.getStringExtra("Mobile")


            val resTV = findViewById<TextView>(R.id.print)

            resTV.text = "$name $loc $pho "
        }}

