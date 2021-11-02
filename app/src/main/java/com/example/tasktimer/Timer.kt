package com.example.tasktimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class Timer : AppCompatActivity() {

    lateinit var tvTask : TextView
    lateinit var tvDetails : TextView
    lateinit var tvTimer : TextView
    lateinit var ivPause : ImageView
    lateinit var ivResume : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        tvTask = findViewById(R.id.tvTask)
        tvDetails = findViewById(R.id.tvDetails)
        tvTimer = findViewById(R.id.tvTimer)
        ivPause = findViewById(R.id.ivPause)
        ivResume = findViewById(R.id.ivResume)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

        }
        return super.onOptionsItemSelected(item)
    }
}