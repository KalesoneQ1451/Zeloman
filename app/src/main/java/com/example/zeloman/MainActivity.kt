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
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button10: Button = findViewById(R.id.button10)
        val button11: Button = findViewById(R.id.button11)
        val button12: Button = findViewById(R.id.button12)
        val button13: Button = findViewById(R.id.button13)
        val button14: Button = findViewById(R.id.button14)
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
        button4.setOnClickListener{
            tekst.setText(R.string.ratio4)
        }
        button5.setOnClickListener{
            tekst.setText(R.string.ratio5)
        }
        button6.setOnClickListener{
            tekst.setText(R.string.ratio6)
        }
        button7.setOnClickListener{
            tekst.setText(R.string.ratio7)
        }
        button8.setOnClickListener{
            tekst.setText(R.string.ratio8)
        }
        button9.setOnClickListener{
            tekst.setText(R.string.ratio9)
        }
        button10.setOnClickListener{
            tekst.setText(R.string.ratio10)
        }
        button11.setOnClickListener{
            tekst.setText(R.string.ratio11)
        }
        button12.setOnClickListener{
            tekst.setText(R.string.ratio12)
        }
        button13.setOnClickListener{
            tekst.setText(R.string.ratio13)
        }
        button14.setOnClickListener{
            tekst.setText(R.string.ratio14)
        }

    }
}