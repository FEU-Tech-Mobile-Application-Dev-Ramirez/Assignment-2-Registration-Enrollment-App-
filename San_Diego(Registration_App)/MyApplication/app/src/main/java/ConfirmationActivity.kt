package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmation)

        val nameDisplay = findViewById<TextView>(R.id.name_display)
        val coursesDisplay = findViewById<TextView>(R.id.courses_display)
        val totalDisplay = findViewById<TextView>(R.id.total_display)

        val name = intent.getStringExtra("name")
        val courses = intent.getStringExtra("courses")
        val total = intent.getIntExtra("total", 0)

        nameDisplay.text = "Name: $name"
        coursesDisplay.text = "Courses: $courses"
        totalDisplay.text = "Total Paid: $$total"
    }
}
