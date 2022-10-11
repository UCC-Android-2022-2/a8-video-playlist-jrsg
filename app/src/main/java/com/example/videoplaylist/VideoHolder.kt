package com.example.videoplaylist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class VideoHolder : RecyclerView.ViewHolder {
    lateinit var ivThumbnail : ImageView
    lateinit var tvSong : TextView
    lateinit var tvArtist : TextView

    constructor(itemView: View) : super(itemView){

        ivThumbnail = itemView.findViewById(R.id.ivThumbnail)
        tvSong = itemView.findViewById(R.id.tvSong)
        tvArtist = itemView.findViewById(R.id.tvArtist)

    }

}
