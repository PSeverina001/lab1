package com.example.lab1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class Setting : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        Log.d("Setting:Severina.polina", "onCreate")

    }
    override fun onStart() {
        super.onStart()
        Log.d("Setting:Severina.polina", "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d("Setting:Severina.polina", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Setting:Severina.polina", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Setting:Severina.polina", "onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Setting:Severina.polina", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Setting:Severina.polina", "onRestart")
    }
}