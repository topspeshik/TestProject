package com.example.testproject.domain

interface WeatherRepository  {

    suspend fun getWeatherList(city: String): List<WeatherInfo>
}