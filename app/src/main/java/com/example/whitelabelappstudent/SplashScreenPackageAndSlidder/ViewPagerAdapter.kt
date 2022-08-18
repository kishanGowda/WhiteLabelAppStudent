package com.example.whitelabelappstudent.SplashScreenPackageAndSlidder

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.whitelabelappstudent.R

class ViewPagerAdapter(private var title: List<String>,private var deatails: List<String>,private var images: List<Int>):RecyclerView.Adapter<ViewPagerAdapter.Pages2ViewHolder>() {


        inner class Pages2ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
            val itemTitle:TextView=itemView.findViewById(R.id.title)
        val itemDetails:TextView=itemView.findViewById(R.id.details)
        val itemImage:ImageView=itemView.findViewById(R.id.image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pages2ViewHolder {
        return  Pages2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.welcomeslide_1,parent,false))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pages2ViewHolder, position: Int) {
      holder.itemTitle.text=title[position]
        holder.itemDetails.text=title[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

}
