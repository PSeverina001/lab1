package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class About : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.d("About:Severina.polina", "onCreate")

    }
    override fun onStart() {
        super.onStart()
        Log.d("About:Severina.polina", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("About:Severina.polina", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("About:Severina.polina", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("About:Severina.polina", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("About:Severina.polina", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("About:Severina.polina", "onRestart")
    }
}