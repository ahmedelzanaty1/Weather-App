package com.example.weatherapp.presentation.Weather

import com.example.weatherapp.domain.WeatherApp.WeatherType
import java.time.LocalDateTime

data class WeatherDataPer(
    val time : LocalDateTime,
    val temperatureCelsius : Double,
    val pressure : Double,
    val windSpeed : Double,
    val humidity : Double,
    val weatherType : WeatherType
)
