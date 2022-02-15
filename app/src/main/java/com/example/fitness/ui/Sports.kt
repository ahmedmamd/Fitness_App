package com.example.fitness.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitness.R
import com.example.fitness.adapter.SportsAdapter
import com.example.fitness.databinding.ActivitySportsBinding
import com.example.fitness.utils.Utils

class Sports : AppCompatActivity() {

    lateinit var binding:ActivitySportsBinding
    lateinit var armAdapter :SportsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sports)
        setUpUi()
    }

    private fun setUpUi() {

        var level = intent.getStringExtra("level")
        var getPart =intent.getStringExtra("getPart")
        var day = intent.getIntExtra("day",0)

        if (level == "start"){
            if (getPart == "arm"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.armStartDay1,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.armStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.armStartDay3, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.armStartDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.armStartDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.armStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.armStartDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }
            else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay2,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.shoulderStartDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
            else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay3,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.stomachStartDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
            else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.legStartDay1, Utils.legStartNameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.legStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.legStartDay3, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.legStartDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.legStartDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.legStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.legStartDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }

        }else if (level == "middle"){
            if (getPart == "arm"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.armMiddleDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.shoulderMiddleDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay2,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay3,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay6,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.stomachMiddleDay7,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.legMiddleDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }

        }else  if (level == "advanced"){
            if (getPart == "arm"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.armAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.shoulderAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.stomachAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = SportsAdapter(Utils.legAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
        }else
            Log.e("day", "day == 0")
    }
}