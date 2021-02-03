package com.example.cinemaapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dayData = DayData("Hello", "World");
        val a = dayData.toString()
        println(a)
        val newDayData = TestObj.copy(dayData = dayData)
        val b = newDayData.toString()
        println(b)



        btnTest.setOnClickListener {
            if (it.isClickable) {



            }

        }
    }

}