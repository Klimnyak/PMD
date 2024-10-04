package com.example.lab2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_test)

        val buttonBack: Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}



