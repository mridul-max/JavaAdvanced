package com.example.JavaAdvanced.repository;

import com.example.JavaAdvanced.model.Beer;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer,Integer> {
    Iterable<Beer> findBeerByBrand(String name);
}
