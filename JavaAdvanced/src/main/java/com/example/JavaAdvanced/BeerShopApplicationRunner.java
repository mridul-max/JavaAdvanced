package com.example.JavaAdvanced;

import com.example.JavaAdvanced.model.Beer;
import com.example.JavaAdvanced.model.Stock;
import com.example.JavaAdvanced.service.BeerService;
import com.example.JavaAdvanced.service.StockService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Log
@Transactional
public class BeerShopApplicationRunner implements ApplicationRunner {
    @Autowired
    private BeerService beerService;
    @Autowired
    private StockService stockService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Beer beer = new Beer("Amstel","Hello");
        beerService.addBeer(beer);
        beerService.getAllBeers().forEach(
                System.out::println
        );
        Stock stock = new Stock(beer,20);
        stockService.addStock(stock);
        stockService.getAllStock().forEach(System.out::println);
    }
}
