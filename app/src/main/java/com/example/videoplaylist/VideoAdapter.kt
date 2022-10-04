package com.example.videoplaylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter : RecyclerView.Adapter<VideoHolder> {
    private lateinit var data : ArrayList<Video>

    constructor(data: ArrayList<Video>) : super() {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
        val view : View = LayoutInflater.from( parent.context ).inflate(R.layout.video_row, parent, false)
        return VideoHolder(view)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        val video : Video = data.get( position )

        holder.tvSong.text = video.song
        holder.tvArtist.text = video.artist
        holder.ivThumbnail.setImageResource( video.thumbnail )

    }

    override fun getItemCount(): Int {
        return data.size
    }


}