package com.example.fitness.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.fitness.R
import com.example.fitness.databinding.ActivityHomeBinding
import com.example.fitness.ui.start.StartActivity

class HomeActivity : AppCompatActivity() {
  lateinit var binding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this , R.layout.activity_home)
        setUPUi()
    }

    private fun setUPUi() {
         binding.start.setOnClickListener(View.OnClickListener {
             val intent = Intent(this , StartActivity::class.java)
             intent.putExtra("level","start")
             startActivity(intent)
         })
        binding.middle.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , StartActivity::class.java)
            intent.putExtra("level","middle")
            startActivity(intent)
         })
        binding.advanced.setOnClickListener(View.OnClickListener {
            val intent = Intent(this , StartActivity::class.java)
            intent.putExtra("level","advanced")
            startActivity(intent)
         })
    }
}