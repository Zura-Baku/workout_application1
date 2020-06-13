package com.example.workout_application1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //input data here
        button_save.setOnClickListener {

            val watertext = editText3.text.toString().trim()
            val walkingtext = editText2.text.toString().trim()

        }
    }
    val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "AppDatabase"
    ).build()
}

