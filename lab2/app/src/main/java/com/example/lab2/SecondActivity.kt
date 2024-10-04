package com.example.lab2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_test)

        val buttonReturn: Button = findViewById(R.id.buttonReturn)
        buttonReturn.setOnClickListener {
            finish()
        }
    }
}

