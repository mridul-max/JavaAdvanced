package com.example.JavaAdvanced.controller;

import com.example.JavaAdvanced.service.BeerService;
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
    @RequestMapping(value = "/updateBeers/{id}",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Beer> updateBeer(@PathVariable int id,Beer beer){
        beerService.updateBeer(id,beer);
        return new ResponseEntity<>(beer,HttpStatus.CREATED);
    }
    @RequestMapping(value = "/deleteBeers/{id}",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteBeer(@PathVariable int id){
         beerService.deleteBeer(id);
    }
}
