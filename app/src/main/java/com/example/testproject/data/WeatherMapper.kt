package com.example.testproject.data

import com.example.testproject.data.model.ForecastDay
import com.example.testproject.data.model.WeatherData
import com.example.testproject.domain.WeatherInfo
import javax.inject.Inject

class WeatherMapper @Inject constructor() {
    fun mapUpdateListWeatherDataToInfo(weatherData: WeatherData) : List<WeatherInfo> {
        return weatherData.forecast?.forecastDays?.map { mapUpdateWeatherDataToInfo(it) }!!
    }

    private fun mapUpdateWeatherDataToInfo(forecastDay: ForecastDay) = WeatherInfo(
        avgTemp = forecastDay.day?.avgtemp_c,
        text = forecastDay.day?.condition?.text,
        icon = forecastDay.day?.condition?.icon,
        maxWind = forecastDay.day?.maxwind_kph,
        avgHumidity = forecastDay.day?.avghumidity,
    )
}