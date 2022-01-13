package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        val xText = findViewById<TextView>(R.id.textView3)
        xText.setText(DatabaseDoesntWork.x.toString()).toString()
        val oText = findViewById<TextView>(R.id.textView5)
        oText.setText(DatabaseDoesntWork.o.toString()).toString()

        val clear : Button = findViewById(R.id.clear)
        clear.setOnClickListener {
            DatabaseDoesntWork.o = 0
            DatabaseDoesntWork.x = 0
            val xText = findViewById<TextView>(R.id.textView3)
            xText.setText(DatabaseDoesntWork.x.toString()).toString()
            val oText = findViewById<TextView>(R.id.textView5)
            oText.setText(DatabaseDoesntWork.o.toString()).toString()
        }
        val back : Button = findViewById(R.id.backstat)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}