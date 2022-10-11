package com.example.videoplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : VideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvVideo : RecyclerView = findViewById(R.id.rvVideos)

        val listaVideos : ArrayList<Video> = llenarListaVideos()

        adapter = VideoAdapter( listaVideos )

        rvVideo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvVideo.adapter = adapter
    }

    private fun llenarListaVideos(): ArrayList<Video> {
        var lista : ArrayList<Video> = ArrayList()

        val artists = resources.getStringArray(R.array.artists)
        val songs   = resources.getStringArray(R.array.songs)
        val urls    = resources.getStringArray(R.array.urls)

        for(i in artists.indices){
            //se toman las cadenas de los arreglos
            val artist : String = artists[i]
            val song : String   = songs[i]
            val url : String    = urls[i]

            //se crea un video "vacío"
            val video : Video = Video()

            //se asignan valor a cada atributo
            video.artist    = artist
            video.song      = song
            video.url       = url
            video.thumbnail = calcularNombreImagen(i)

            //se agrega a la lista
            lista.add(video)
        }

        return lista
    }

    private fun calcularNombreImagen(i: Int): Int {
        var archivo = "t_song" + i
        return resources.getIdentifier(archivo, "drawable", packageName)
    }
}