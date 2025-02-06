package com.example.weatherapp.presentation.Weather

data class WeatherInfo (
    val WeatherDatePerDay : Map<Int , List<WeatherDataPer>>
    ,val CurrentWeatherData : WeatherDataPer?
)