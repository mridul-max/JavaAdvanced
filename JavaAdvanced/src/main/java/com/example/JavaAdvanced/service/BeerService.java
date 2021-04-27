package com.example.JavaAdvanced.service;

import com.example.JavaAdvanced.model.Beer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeerService {
    private List<Beer> beers = new ArrayList<>();
    public BeerService(){
        this.beers = new ArrayList<>(List.of(new Beer("Amstel","citeron")
        )
        );
    }
    public List<Beer>getAllBeers(){
     return beers;
 }
 public Beer addBeer(Beer beer) {
     beers.add(beer);
     return beer;
 }
 public void updateBeer(int beerId,Beer beer){
     for (int i =0; i<beers.size();i++){
        Beer beer1 = beers.get(i);
        if(beer1.getId()==beerId){
            beers.set(beerId,beer);
            return;
        }
     }

 }
    public void deleteBeer(int beerId) {
        for (int i =0; i<beers.size();i++){
            Beer beer1 = beers.get(i);
            if(beer1.getId()==beerId){
                beers.remove(beer1);
                return;
            }
        }
    }
}
