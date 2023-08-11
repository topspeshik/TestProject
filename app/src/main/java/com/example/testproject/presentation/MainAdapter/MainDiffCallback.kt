package com.example.testproject.presentation.MainAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.testproject.domain.WeatherInfo

object MainDiffCallback: DiffUtil.ItemCallback<WeatherInfo>() {
    override fun areItemsTheSame(oldItem: WeatherInfo, newItem: WeatherInfo): Boolean {
        return oldItem.avgTemp == newItem.avgTemp
    }

    override fun areContentsTheSame(oldItem: WeatherInfo, newItem: WeatherInfo): Boolean {
        return oldItem == newItem
    }
}