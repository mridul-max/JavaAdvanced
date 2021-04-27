package com.example.JavaAdvanced.repository;

import com.example.JavaAdvanced.model.Stock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock,Integer> {
}
