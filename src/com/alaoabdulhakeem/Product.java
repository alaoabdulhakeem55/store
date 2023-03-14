package com.alaoabdulhakeem;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
    public void reduceQuantity(int quantity) {
        if(this.quantity < quantity) {
            System.out.println(this.name + " is out of stock.");
            return;
        }
        this.quantity -= quantity;
    }
//    public boolean isOutOfStock() {
//        return quantity == 0;
//    }
}
