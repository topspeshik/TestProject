package com.example.testproject.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testproject.domain.GetWeatherListUseCase
import com.example.testproject.domain.WeatherInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getWeatherListUseCase: GetWeatherListUseCase
): ViewModel() {

    private val _weatherList =  MutableLiveData<List<WeatherInfo>>()
    var weatherList: LiveData<List<WeatherInfo>> = _weatherList

    fun getWeatherList(city:String) {
        viewModelScope.launch {
            _weatherList.value = getWeatherListUseCase(city)
        }
    }
}