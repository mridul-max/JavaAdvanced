package com.example.JavaAdvanced.service;

import com.example.JavaAdvanced.model.Stock;
import com.example.JavaAdvanced.repository.StockRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
public class StockService {
    @Autowired
    private StockRepository stockRepository;
    public List<Stock>getAllStock(){
        List<Stock>stocks= (List<Stock>)stockRepository.findAll();
        log.info("Getting all stocks");
        return stocks;
    }
    public Stock addStock(Stock stock){
        return stockRepository.save(stock);
    }
}
