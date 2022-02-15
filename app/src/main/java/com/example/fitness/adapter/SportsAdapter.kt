package com.example.fitness.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fitness.R
import com.example.fitness.databinding.ItemDaysBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import pl.droidsonroids.gif.GifImageView


class SportsAdapter(
        var arms: Array<Int> = arrayOf<Int>(),
        var exersizeName: Array<String> = arrayOf<String>(),
        val context: Context
): RecyclerView.Adapter<SportsAdapter.ArmsViewHolder>() {

    class ArmsViewHolder(binding: ItemDaysBinding): RecyclerView.ViewHolder(binding.root) {
        var gif :GifImageView
        var textView:TextView

        init {
            gif = binding.gif
            textView= binding.exName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArmsViewHolder {
        val binding:ItemDaysBinding
        binding=DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_days, parent, false)
        return ArmsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArmsViewHolder, position: Int) {
       holder.textView.text = exersizeName.get(position)
         Glide.with(context)
            .load(arms.get(position))
            .into(holder.gif)

        holder.itemView.setOnClickListener(View.OnClickListener {
            Log.e("size", "arm size"+arms.size )
            var positionButtonSheet = position
            val bottomSheetDialog = BottomSheetDialog(context)
            bottomSheetDialog.setContentView(R.layout.layout_button_sheet)

            var next: ImageView = bottomSheetDialog.findViewById(R.id.next)!!
            var back: ImageView = bottomSheetDialog.findViewById(R.id.back)!!
            var exName:TextView = bottomSheetDialog.findViewById(R.id.ex_name)!!
            exName.setText(exersizeName.get(position))
            var textView: TextView = bottomSheetDialog.findViewById(R.id.numberOFItem)!!
            textView.setText("" + (positionButtonSheet+1) + "/" + arms.size)

            if (positionButtonSheet == 0) {
                back.isEnabled = false
                next.isEnabled = true
            } else if (positionButtonSheet == arms.size - 1) {
                next.isEnabled = false
                back.isEnabled = true
            }

            var gifimgview: GifImageView = bottomSheetDialog.findViewById(R.id.tyu)!!
            Glide.with(context).load(arms.get(position)).into(gifimgview)
            var close: Button = bottomSheetDialog.findViewById(R.id.close)!!
            close.setOnClickListener(View.OnClickListener {
                bottomSheetDialog.dismiss()
            })
            next.setOnClickListener(View.OnClickListener {
                positionButtonSheet++
                back.isEnabled = true

                var gifimgview: GifImageView = bottomSheetDialog.findViewById(R.id.tyu)!!
                Glide.with(context).load(arms.get(positionButtonSheet)).into(gifimgview)
                textView.setText("" + (positionButtonSheet+1) + "/" + arms.size)
                exName.setText(exersizeName.get(positionButtonSheet))
                if (positionButtonSheet == arms.size - 1) {
                    next.isEnabled = false
                }
            })
            back.setOnClickListener(View.OnClickListener {
                next.isEnabled = true
                positionButtonSheet--

                var gifimgview: GifImageView = bottomSheetDialog.findViewById(R.id.tyu)!!
                Glide.with(context).load(arms.get(positionButtonSheet)).into(gifimgview)
                textView.setText(""+(positionButtonSheet+1) + "/" + arms.size)
                exName.setText(exersizeName.get(positionButtonSheet))
                if (positionButtonSheet == 0) {
                 back.isEnabled = false
            }
            })
            bottomSheetDialog.show()
        })

    }

    override fun getItemCount(): Int {
        return arms.size
    }
}