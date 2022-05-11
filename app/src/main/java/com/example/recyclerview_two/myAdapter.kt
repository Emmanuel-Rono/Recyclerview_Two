package com.example.recyclerview_two

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class myAdapter(val dataTitle:Array<String>,val imageUrl:Array<String>)
    :RecyclerView.Adapter<myAdapter.myViewHolder>() {
//myAdapter receives data as declared in its constructor from the source where it is
// stored(Dataset)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
//we get the item views here to be used in our view
        val  view=LayoutInflater.from(parent.context).inflate(R.layout.griditem_view,parent,
            false)
        return myViewHolder(view)
    }


    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        //To access the data
holder.TitleText.text=dataTitle[position]
        Picasso.get().load(imageUrl[position] ).into(holder.image)
    }

    override fun getItemCount(): Int {
        return dataTitle.size
    }



    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //we will place data to this views
        //bindView allocates data to this views
        val image=itemView.findViewById<ImageView>(R.id.Image)
        val TitleText=itemView.findViewById<TextView>(R.id.TitleText)
    }
}

