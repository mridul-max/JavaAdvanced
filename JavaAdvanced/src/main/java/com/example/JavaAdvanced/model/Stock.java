package com.example.JavaAdvanced.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Stock {
    @Id
    @GeneratedValue(generator = "stock_id")
    private int id;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "beer_id")
    private Beer beer;
    private int quantity;

    public Stock(){

    }
    public Stock(Beer beer, int quantity) {
        this.beer = beer;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", beer=" + beer +
                ", quantity=" + quantity +
                '}';
    }
}
