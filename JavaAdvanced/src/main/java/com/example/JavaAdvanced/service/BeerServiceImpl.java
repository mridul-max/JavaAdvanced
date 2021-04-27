package com.example.JavaAdvanced.service;

import com.example.JavaAdvanced.repository.BeerRepository;
import com.example.JavaAdvanced.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public Beer addBeer(Beer beer) {
        beerRepository.save(beer);
        return beer;
 }
    public List<Beer>getAllBeers(){
        return (List<Beer>) beerRepository.findAll();
 }
    public Beer getBeerById(int id){
        return beerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Beer> getBeerByBrand(String name) {
        return (List<Beer>)beerRepository.findBeerByBrand(name);
    }
}
