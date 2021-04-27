package com.example.JavaAdvanced.controller;

import com.example.JavaAdvanced.service.BeerService;
import com.example.JavaAdvanced.service.BeerServiceImpl;
import com.example.JavaAdvanced.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Beers")
public class BeerController {
    @Autowired
    private BeerService beerService;
    @RequestMapping(value = "/getBeers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Beer>>getGuitars(){
       List<Beer> beers = beerService.getAllBeers();
       return new ResponseEntity<>(beers, HttpStatus.OK);
    }
    @RequestMapping(value = "/addBeers",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Beer>addBeer(@RequestBody Beer beer){
        beerService.addBeer(beer);
        return new ResponseEntity<>(beer,HttpStatus.CREATED);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Beer> getBeerById(@PathVariable int id){
        return new ResponseEntity<Beer>(beerService.getBeerById(id),HttpStatus.OK);
    }
    @RequestMapping(value = "brand",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Beer>> getBeerByBrand(@RequestParam String name){
        return new ResponseEntity<List<Beer>>(beerService.getBeerByBrand(name),HttpStatus.OK);
    }

}
