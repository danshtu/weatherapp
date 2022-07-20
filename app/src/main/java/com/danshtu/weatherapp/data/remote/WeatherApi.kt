package com.danshtu.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    // Temperature (2 m), Relative Humidity (2 m), Sealevel Pressure, Weathercode, Wind Speed (10 m)
    @GET("v1/forecast?hourly=temperature_2m,relativehumidity_2m,pressure_msl,weathercode,windspeed_10m")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}