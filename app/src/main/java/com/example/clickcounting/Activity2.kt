package com.example.clickcounting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    fun sendThread(view: View){
        val editText = findViewById<TextView>(R.id.set_num)
        val message = editText.text.toString()
        val thresholdNum = Integer.parseInt(message)
        val intent = Intent(this, MainActivity::class.java).apply{
            putExtra(EXTRA_USER_NUMBERS, thresholdNum)
        }
        startActivity(intent)
    }

}