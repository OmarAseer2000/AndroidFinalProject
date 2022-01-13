package com.example.finalproject

import android.content.ContentResolver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.R.id

import android.content.ContentUris
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startGameButton : Button = findViewById(R.id.startGameButton)
        startGameButton.setOnClickListener { view ->
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

        val helpButton : Button = findViewById(R.id.helpButton)
        helpButton.setOnClickListener { view ->
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        val statsButton : Button = findViewById(R.id.statsButton)
        statsButton.setOnClickListener { view ->
            val intent = Intent(this, StatsActivity::class.java)
            startActivity(intent)
        }
        //delete data:
        //val uri = contentResolver.delete(StatsProvider.CONTENT_URI, "_id < 2", null)
    }

}