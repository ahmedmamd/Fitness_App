package com.example.fitness.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitness.R
import com.example.fitness.adapter.ArmsAdapter
import com.example.fitness.databinding.ActivitySportsBinding
import com.example.fitness.utils.Utils

class Sports : AppCompatActivity() {

    lateinit var binding:ActivitySportsBinding
    lateinit var armAdapter :ArmsAdapter
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
                    armAdapter  = ArmsAdapter(Utils.armStartDay1,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.armStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.armStartDay3, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.armStartDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.armStartDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.armStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.armStartDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }
            else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay2,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.shoulderStartDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
            else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay3,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.stomachStartDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
            else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.legStartDay1, Utils.legStartNameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.legStartDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.legStartDay3, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.legStartDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.legStartDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.legStartDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.legStartDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }

        }else if (level == "middle"){
            if (getPart == "arm"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay5, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.armMiddleDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay1, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay2, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay4, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay6, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.shoulderMiddleDay7, Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay2,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay3,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay6,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.stomachMiddleDay7,Utils.armStartnameDay1,this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.legMiddleDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }

        }else  if (level == "advanced"){
            if (getPart == "arm"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.armAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }

            }else if (getPart == "shoulder"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.shoulderAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "stomach"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.stomachAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }else if (getPart == "legs"){
                if (day == 1){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay1,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 2){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay2,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 3){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay3,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 4){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay4,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 5){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay5,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 6){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay6,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }else if (day == 7){
                    armAdapter  = ArmsAdapter(Utils.legAdvancedDay7,Utils.armStartnameDay1, this)
                    binding.sports.layoutManager=LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false)
                    binding.sports.adapter =armAdapter
                }
            }
        }else
            Log.e("day", "day == 0")
    }
}