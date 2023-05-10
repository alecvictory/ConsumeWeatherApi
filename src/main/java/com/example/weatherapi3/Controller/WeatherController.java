package com.example.weatherapi3.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @GetMapping(value = "/weather")
    public Object getWeather(@RequestParam String city,
                             @RequestParam String appId) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + appId;
        RestTemplate restTemplate = new RestTemplate();
        Object weather = restTemplate.getForObject(url, Object.class);

        return weather;
    };
}
