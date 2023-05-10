package com.example.weatherapi3.Model;


import java.util.Objects;

public class Weather {
    private String cityName;
    private String description;
    private int temperature;
    private int humidity;
    private int windSpeed;

    public Weather() {
    }

    public Weather(String cityName, String description, int temperature, int humidity, int windSpeed) {
        this.cityName = cityName;
        this.description = description;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                ", cityName='" + cityName + '\'' +
                ", description='" + description + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return temperature == weather.temperature && humidity == weather.humidity && windSpeed == weather.windSpeed && Objects.equals(cityName, weather.cityName) && Objects.equals(description, weather.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, description, temperature, humidity, windSpeed);
    }
}
