package com.example.weatherapi3.Controller;
import com.example.weatherapi3.Exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @GetMapping(value = "/weather")
    public Object getWeather(@RequestParam String city,
                             @RequestParam String appId) {
        if (city.isBlank() || city.isEmpty()){
            throw new CityNotFoundException("City is empty, please provide a city - " + city);
        }
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + appId;
        RestTemplate restTemplate = new RestTemplate();
        Object weather = restTemplate.getForObject(url, Object.class);

        return weather;
    };

    @ExceptionHandler
    public ResponseEntity<WeatherErrorResponseController> handleException(CityNotFoundException exception){

        WeatherErrorResponseController error = new WeatherErrorResponseController();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());


        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
