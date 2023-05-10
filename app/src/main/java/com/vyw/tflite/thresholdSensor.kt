package com.vyw.tflite
import android.content.Context
import android.media.MediaPlayer

class thresholdSensor(val calibrate: Calibration) {
    var calib = Calibration()

    init{
        calib = calibrate
    }

    fun playSound(context : Context, id : Int){
        val mediaPlayer = MediaPlayer.create(context, id);
        mediaPlayer.start()
    }
}