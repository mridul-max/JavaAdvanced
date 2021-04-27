package com.example.JavaAdvanced.model;

import javax.persistence.*;

@Entity
public class Beer {

    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String model;

    public Beer(){

    }
    public Beer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
