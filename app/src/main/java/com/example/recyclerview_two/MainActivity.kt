package com.example.recyclerview_two

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTitle :Array<String> =resources.getStringArray(R.array.dataTitle)
        val imageUrl:Array<String> =resources.getStringArray(R.array.imageUrl)
        val gridLayout=GridLayoutManager(this,2)
        val adapter=myAdapter(dataTitle, imageUrl)
        val Recy=findViewById<RecyclerView>(R.id.Recy)
        Recy.layoutManager=gridLayout
        Recy.adapter=adapter


    }
}

