package com.example.jokar.kotlin_button_click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var  count = 1
         val btn =  findViewById<Button>(R.id.button)
        val txt  = findViewById<TextView>(R.id.text)
        btn.setOnClickListener{
            count++
            if(count==100)
                txt.setText("you cant go beyond this")
            else
            txt.setText(count.toString())
        }
    }
}
