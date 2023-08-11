package com.example.testproject.presentation.MainAdapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.Glide
import com.example.testproject.R
import com.example.testproject.databinding.WeatherItemBinding
import com.example.testproject.domain.WeatherInfo


class MainAdapter: ListAdapter<WeatherInfo, MainViewHolder>(MainDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = WeatherItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val weather = getItem(position)

        with(holder.binding){
            with(weather){

                tvHum.text = holder.itemView.context.getString(R.string.humidity).format(String.format("%.1f", avgHumidity))
                tvTemp.text = holder.itemView.context.getString(R.string.temp).format(String.format("%.1f", avgTemp))
                tvWind.text = holder.itemView.context.getString(R.string.wind).format(String.format("%.1f", maxWind))
                tvText.text = text
                Glide.with(holder.itemView).load("https:$icon").into(ivIcon)

            }
        }



    }
}