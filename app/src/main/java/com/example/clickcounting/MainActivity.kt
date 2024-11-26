package com.example.clickcounting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.absoluteValue
const val EXTRA_USER_NUMBERS = "csc.244.switchactivity.USER_NUMBERS"
const val startNum = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = intent.getIntExtra(EXTRA_USER_NUMBERS, 5)

        val mainText = findViewById<TextView>(R.id.textView1)
        var num = startNum
        mainText.text = num.toString()


            val button1 = findViewById<Button>(R.id.button1)
            button1.setOnClickListener {

                num = (num - 1)
                mainText.text = num.toString()

                if(num == thread){
                    setThread()
                }
            }


            val button2 = findViewById<Button>(R.id.button2)
            button2.setOnClickListener {
                num = (num + 1)
                mainText.text = num.toString()

                if(num == thread ){
                    setThread()
                }

            }



    }

    fun setThread(){
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

}