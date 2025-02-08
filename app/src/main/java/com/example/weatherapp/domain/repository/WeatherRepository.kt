package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.utils.Resource
import com.example.weatherapp.presentation.Weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}