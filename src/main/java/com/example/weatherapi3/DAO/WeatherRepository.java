package com.example.weatherapi3.DAO;

import com.example.weatherapi3.Model.Weather;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class WeatherRepository implements CrudRepository<Weather, Integer> {
    @Override
    public <S extends Weather> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Weather> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Weather> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Weather> findAll() {
        return null;
    }

    @Override
    public Iterable<Weather> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Weather entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Weather> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
