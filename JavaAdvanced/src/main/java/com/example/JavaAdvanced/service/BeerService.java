package com.example.JavaAdvanced.service;

import com.example.JavaAdvanced.model.Beer;

import java.util.List;

public interface BeerService {
    Beer addBeer(Beer beer);
    List<Beer> getAllBeers();
    Beer getBeerById(int id);
    List<Beer>getBeerByBrand(String name);
}
