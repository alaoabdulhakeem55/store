package com.alaoabdulhakeem;

import java.util.ArrayList;

public class Cashier extends Staff {
    private double totalSales;
    private ArrayList<Product> productsSold;

    public Cashier(String name, int age, String gender) {
        super(name, age, gender);
        totalSales = 0.0;
        productsSold = new ArrayList<>();
    }
//    private double totalSales;
//    private ArrayList<Product> productsBought;
//    private ArrayList<Product> products;
//
//    public Cashier(String name, int age, String gender) {
//        super(name, age, gender);
//        totalSales = 0;
//        productsBought = new ArrayList<>();
//        products = new ArrayList<>();
//    }

//    public ArrayList<Product> getProductBought() {
//        return productBought;
//    }

//    public ArrayList<Product> getProducts() {
//        return products;
//    }

    public ArrayList<Product> getProductsSold() {
        return productsSold;
    }

//    public void processSale(Product product, int quantity) {
//        if (products.contains(product) && product.getQuantity() >= quantity) {
//            double price = product.getPrice() * quantity;
//            totalSales += price;
//            product.reduceQuantity(quantity);
//            System.out.println(quantity + " " + product.getName() + " sold for $" + price);
//        } else {
//            System.out.println(product.getName() + " is out of stock.");
//        }
//    }
    public void sellProduct(Product product, int quantity) {
        if (product.getQuantity() > quantity) {
            double price = product.getPrice() * quantity;
            product.reduceQuantity(quantity);
//            Receipt receipt = new Receipt(product, quantity, price);
            productsSold.add(product);
            totalSales += price;
//            System.out.println("Receipt for " + getName() + ": " + receipt.toString());
        } else {
            System.out.println(product.getName() + " is out of stock.");
        }
    }
    public void addProduct(Product product, int quantity) {
        productsSold.add(product);
    }
    public void giveSalesReport(Manager manager) {
        String salesReport = "Sales report for " + getName() + ":\n";
        for (Product product : productsSold) {
            salesReport += product.getName() + " - Quantity sold: " + productsSold.lastIndexOf(product) + "\n";
        }
        salesReport += "Total sales: $" + String.format("%.2f", totalSales);
        manager.receiveSalesReport(salesReport);
    }
//    public void recordSale(double saleAmount) {
//        // Update the total sales for the cashier
//        this.totalSales += saleAmount;
//    }

//    public String getCashierSalesReport() {
        // Generate a sales report string
//        String salesReport = "Cashier Name: " + getName() + "\n"
//                + "Total Sales: $" + totalSales;

//        return salesReport;
//    }
//    public void giveSalesReport() {
//        System.out.println("Sales report given to manager: $" + this.totalSales);
//    }
//    public void sellProduct(Product product) {
//        Customer customer = new Customer(getName());
//        if(product.getStock() > 0) {
//            customer.getProductBought();
//            product.setStock(product.getStock() -1);
//            double stock = product.getPrice();
//            customer.pay(customer.getTotalPrice());
//            System.out.println("Sold " + product.getName() + " to " + customer.getName() + " for $ " + product.getPrice());
//        } else {
//            System.out.println(product.getName() + " is out of stock.");
//        }
//    }
//    public double getTotalSales() {
//    return totalSales;
//    }

//    public void addProduct(Product product) {
//        products.add(product);
//    }
    public void dispenseReceipt(Customer customer) {
        System.out.println("Receipt for: " + customer.getName() + ": ");
        for(Product product : customer.getProductBought()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
//        System.out.println("Total: $" + customer.getTotalPrice());
    }
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product products : this.productsSold) {
            totalPrice += products.getPrice();
        }
        return totalPrice;
    }


//    public double getTotalStock() {
//        double totalStock = 0;
//        for(Product product : productSold) {
//            totalStock += product.getPrice();
//        }
//        return totalStock;
//    }

//    public ArrayList<Product> getTotalProductSold() {
//        return productSold;
//    }

    @Override
    public void performJob() {
        System.out.println("Cashier " + getName() + " is attending to customers.");
    }

}
