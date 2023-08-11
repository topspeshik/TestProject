package com.example.testproject.domain

import javax.inject.Inject

class GetWeatherListUseCase @Inject constructor(
    private val repository: WeatherRepository) {
    suspend operator fun invoke(city: String) = repository.getWeatherList(city)
}