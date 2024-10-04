package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFirst: Button = findViewById(R.id.buttonFirst)
        val buttonSecond: Button = findViewById(R.id.buttonSecond)

        buttonFirst.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

        buttonSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}

