package com.example.sample2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton

lateinit var layout : LinearLayout
lateinit var b1: Button
lateinit var green :RadioButton
lateinit var red :RadioButton
lateinit var yellow :RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout =findViewById(R.id.layout)
        green = findViewById(R.id.r1)
        red = findViewById(R.id.r2)
        yellow = findViewById(R.id.r3)
        b1 = findViewById(R.id.b1)

        b1.setOnClickListener {

            if (green.isChecked)
                layout.setBackgroundColor(Color.GREEN)
            if(red.isChecked)
                layout.setBackgroundColor(Color.RED)
            if(yellow.isChecked)
                layout.setBackgroundColor(Color.YELLOW)
        }
    }


}