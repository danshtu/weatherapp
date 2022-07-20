package com.danshtu.weatherapp.domain.weather

import com.danshtu.weatherapp.data.remote.WeatherDataDto

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
