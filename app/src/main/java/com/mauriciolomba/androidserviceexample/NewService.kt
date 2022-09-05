package com.mauriciolomba.androidserviceexample

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log

class NewService : Service() {

    // declaring object of MediaPlayer
    private lateinit var player: MediaPlayer

    // execution of service will start on calling this method
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("Mauricio", "onStartCommand")

        // creating a media player which will play the audio of Default ringtone in android device
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)

        // play the audio on loop
        player.isLooping

        // starting the process
        player.start()

        // returns the status of the program
        return START_STICKY
    }

    // execution of the service will stop on calling this method
    override fun onDestroy() {
        Log.i("Mauricio", "onDestroy")
        super.onDestroy()
        player.stop()
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.i("Mauricio", "onBind")
        return null
    }
}