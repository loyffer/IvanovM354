package com.example.ivanovm354

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonClose: Button = findViewById(R.id.buttonClose)
        val imageView: ImageView = findViewById(R.id.myImageView)

        buttonShow.setOnClickListener {
            buttonShow.visibility = View.GONE

            imageView.visibility = View.VISIBLE
            buttonClose.visibility = View.VISIBLE
        }

        buttonClose.setOnClickListener {
            imageView.visibility = View.GONE
            buttonClose.visibility = View.GONE

            buttonShow.visibility = View.VISIBLE
        }
    }
}