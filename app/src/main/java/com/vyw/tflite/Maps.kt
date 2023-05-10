package com.vyw.tflite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Maps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val return_icon = findViewById<ImageView>(R.id.back)
        val title = findViewById<TextView>(R.id.toolbar_title)
        return_icon.setOnClickListener {
            startActivity(
                Intent(
                    this@Maps,
                    MainActivity::class.java
                )
            )
        }

        val fragment = FragmentMap()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}
