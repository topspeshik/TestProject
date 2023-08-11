package com.example.testproject.data.model

import com.google.gson.annotations.SerializedName

data class ForecastDay (
    @SerializedName("day")
    val day: Day?
)