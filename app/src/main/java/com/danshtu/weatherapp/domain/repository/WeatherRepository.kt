package com.danshtu.weatherapp.domain.repository

import com.danshtu.weatherapp.domain.util.Resource
import com.danshtu.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}