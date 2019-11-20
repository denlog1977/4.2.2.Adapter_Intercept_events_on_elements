package com.example.a422Adapter_Intercept_events_on_elements;

public class Product {

    int price;
    int quantity;
    String name;
    int image;

    public Product(int price, int quantity, String name, int image) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.image = image;
    }

    public Product(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
}
