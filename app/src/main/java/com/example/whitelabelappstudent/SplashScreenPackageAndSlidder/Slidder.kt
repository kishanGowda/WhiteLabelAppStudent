package com.example.whitelabelappstudent.SplashScreenPackageAndSlidder

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

import com.example.whitelabelappstudent.R
import kotlinx.android.synthetic.main.activity_slidder.*
import me.relex.circleindicator.CircleIndicator3

class Slidder : AppCompatActivity() {
    var titleList= mutableListOf<String>()
    var details= mutableListOf<String>()
    var imageList= mutableListOf<Int>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidder)
        postToList()

        view_pager.adapter=ViewPagerAdapter(titleList,details,imageList)
        view_pager.orientation=ViewPager2.ORIENTATION_HORIZONTAL

//        val indicator:CircleIndicator3=findViewById(R.id.indicator)
//        indicator.setViewPager(view_pager)

       // indicator.attachViewPager(view_pager)
//

    }
    private  fun addToList(title:String, description:String,image:Int){
        titleList.add(title)
        details.add(description)
        imageList.add(image)
    }
    private fun postToList(){
        for(i:Int in 1..5){
            addToList("one $i","jhvsdghv",R.drawable.welcomeslide_1)
        }
    }
}





