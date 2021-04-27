package com.example.JavaAdvanced.controller;

import com.example.JavaAdvanced.model.Stock;
import com.example.JavaAdvanced.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Stocks")
public class StockController {
    @Autowired
    private StockService stockService;
    public ResponseEntity<List<Stock>>getAllStocks(){
        return new ResponseEntity<List<Stock>>(stockService.getAllStock(), HttpStatus.OK);
    }

}
