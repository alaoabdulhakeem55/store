package com.alaoabdulhakeem;

import java.util.ArrayList;

public class Customer {
    private String name;
//    private double balance;
    private Cashier cashier;
    private ArrayList<Product> productBought;

    public Customer(String name, Cashier cashier) {
        this.name = name;
        this.cashier = cashier;
        this.productBought = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProductBought() {
        return productBought;
    }

    public void buyProduct(Product product, Cashier cashier, int quantity) {
        System.out.println(name + " is buying product from " + cashier.getName());
    }
    public void addProductBought(Product product, int quantity) {
        this.cashier.addProduct(product, quantity);
    }
//    public double getTotalPrice() {
//        double totalStock = 0;
//        for(Product product : productBought) {
//            totalStock += product.getPrice();
//        }
//        return totalStock;
//    }
    public void pay(double amount) {
        System.out.println(name + " paid $" + amount);
    }
    public boolean dispenseReceipt() {
        System.out.println(name + " is receiving receipt");
        return true;
    }

    public double getTotalPrice() {
        return this.cashier.getTotalPrice();
    }
}
