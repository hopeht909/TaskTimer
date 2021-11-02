package com.example.tasktimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewTask : AppCompatActivity() {

    lateinit var etTaskName : EditText
    lateinit var etDescription : EditText
    lateinit var btSave : Button
    lateinit var btView : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)

        etTaskName = findViewById(R.id.etTaskName)
        etDescription = findViewById(R.id.etDescription)
        btSave = findViewById(R.id.btSave)
        btView = findViewById(R.id.btView)
    }
}