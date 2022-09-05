package com.mauriciolomba.androidserviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var start: Button = findViewById(R.id.startButton)
        var stop: Button = findViewById(R.id.stopButton)

        start.setOnClickListener{
            // starting the service
            startService(Intent(this, NewService::class.java))



        }

        stop.setOnClickListener{
            // stopping the service
            stopService(Intent(this, NewService::class.java))
        }
    }
}