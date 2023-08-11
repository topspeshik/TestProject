package com.example.testproject.data

import com.example.testproject.domain.WeatherInfo
import com.example.testproject.domain.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val apiFactory: ApiFactory,
    private val mapper: WeatherMapper
): WeatherRepository {
    override suspend fun getWeatherList(city: String): List<WeatherInfo> {
        val weatherList = apiFactory.apiService.getWeatherList(city = city)
        return mapper.mapUpdateListWeatherDataToInfo(weatherList)
    }
}