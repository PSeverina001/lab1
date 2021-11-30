package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Main:Severina.polina", "onCreate")
        val settingsButton = findViewById<Button>(R.id.button1)
        val aboutButton = findViewById<Button>(R.id.button2)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main:Severina.polina", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main:Severina.polina", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main:Severina.polina", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main:Severina.polina", "onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main:Severina.polina", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main:Severina.polina", "onRestart")
    }
}