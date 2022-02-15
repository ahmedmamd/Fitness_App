package com.example.fitness.ui.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.fitness.R
import com.example.fitness.databinding.ActivityArmDaysFirstBinding
import com.example.fitness.ui.Sports

class ArmDaysStart : AppCompatActivity() {
    lateinit var binding:ActivityArmDaysFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_arm_days_first)
        setUpUi()
    }

    private fun setUpUi() {

        Glide.with(this).load(intent.getIntExtra("img",0)).into(binding.img)

        val level = intent.getStringExtra("level")
        val getPart = intent.getStringExtra("getPart")

        binding.day1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",1)
            startActivity(intent)
        })

        binding.day2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",2)
            startActivity(intent)
        })

        binding.day3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",3)
            startActivity(intent)
        })

        binding.day4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",4)
            startActivity(intent)
        })

        binding.day5.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",5)
            startActivity(intent)
        })

        binding.day6.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",6)
            startActivity(intent)
        })

        binding.day7.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , Sports::class.java)
            intent.putExtra("level",level)
            intent.putExtra("getPart",getPart)
            intent.putExtra("day",7)
            startActivity(intent)
        })


    }
}