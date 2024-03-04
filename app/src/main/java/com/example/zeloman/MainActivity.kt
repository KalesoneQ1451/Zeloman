package com.example.zeloman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val tekst: TextView = findViewById(R.id.textView)
        button1.setOnClickListener{
            tekst.setText(R.string.ratio)
        }
        button2.setOnClickListener{
            tekst.setText(R.string.ratio2)
        }
        button3.setOnClickListener{
            tekst.setText(R.string.ratio3)
        }

    }
}