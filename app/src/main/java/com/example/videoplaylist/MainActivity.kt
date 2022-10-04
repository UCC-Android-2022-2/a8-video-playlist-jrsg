package com.example.videoplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : VideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvVideo : RecyclerView = findViewById(R.id.rvVideos)

        adapter = VideoAdapter()
        rvVideo.adapter = adapter
    }
}