package com.example.testproject.data

import com.example.testproject.data.model.WeatherData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("forecast.json")
    suspend fun getWeatherList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "d200bfd773d94afb935100649231108",
        @Query(QUERY_PARAM_CITY) city: String = "Moscow",
        @Query(QUERY_PARAM_DAYS) days: Int = 5
    ) : WeatherData

    companion object {
        private const val QUERY_PARAM_API_KEY = "key"
        private const val QUERY_PARAM_CITY = "q"
        private const val QUERY_PARAM_DAYS = "days"

    }
}