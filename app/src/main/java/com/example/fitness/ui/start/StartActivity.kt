package com.example.fitness.ui.start

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fitness.R
import com.example.fitness.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_start)
        setUPUi()
    }

    private fun setUPUi() {
        val level = intent.getStringExtra("level")
        binding.arm.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DaysStart::class.java)
            intent.putExtra("level", level)
            intent.putExtra("getPart", "arm")
            intent.putExtra("img", R.drawable.arm)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.arm, "arm")

            //start the new activity
              startActivity(intent, options.toBundle())

        })

        binding.shoulder.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DaysStart::class.java)
            intent.putExtra("level", level)
            intent.putExtra("getPart", "shoulder")
            intent.putExtra("img", R.drawable.shoulder)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.shoulder, "shoulder")

            // start the new activity
            startActivity(intent, options.toBundle())
       })

        binding.stomach.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DaysStart::class.java)
            intent.putExtra("level", level)
            intent.putExtra("getPart", "stomach")
            intent.putExtra("img", R.drawable.stomach)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.stomach, "stomach")

            // start the new activity
            startActivity(intent, options.toBundle())
          //  startActivity(intent)
        })

        binding.legs.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DaysStart::class.java)
            intent.putExtra("level", level)
            intent.putExtra("getPart", "legs")
            intent.putExtra("img", R.drawable.legs)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.legs, "legs")
            // start the new activity
            startActivity(intent, options.toBundle())
        })
    }
}