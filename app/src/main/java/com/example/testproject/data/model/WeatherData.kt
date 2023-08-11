package com.example.testproject.data.model

import com.google.gson.annotations.SerializedName

data class WeatherData (

    @SerializedName("forecast")
    val forecast: Forecast?

)