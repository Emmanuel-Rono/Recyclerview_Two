package com.example.recyclerview_two

import android.icu.text.CaseMap
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class myAdapter(val dataTitles:Array<String>,val imageUrl:Array<String>)
    :RecyclerView.Adapter<myAdapter.myViewHolder>() {
//myAdapter receives data as declared in its constructor from the source where it is stored(Dataset)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
//we get the item views here to be used in our view

        val  view=LayoutInflater.from(parent.context).inflate(R.layout.griditem_view,parent,
            false)
        return myViewHolder(view)
    }


    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
holder.TitleText.text=dataTitles(position)
        Picasso.get().load(imageUrl[position] ).into(holder.image)
    }

    override fun getItemCount(): Int {
        return dataTitles.size
    }

    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image=itemView.findViewById<ImageView>(R.id.Image)
        val TitleText=itemView.findViewById<TextView>(R.id.TitleText)
    }
}

