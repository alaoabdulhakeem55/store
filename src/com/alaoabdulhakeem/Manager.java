package com.alaoabdulhakeem;

import java.util.ArrayList;

public class Manager extends Staff {
//    private Cashier cashier;
//    private double totalSales;
    private ArrayList<Cashier> cashiers;
//    private ArrayList<Product> productBought;

    public Manager(String name, int age, String gender) {
        super(name, age, gender);
//        this.cashier = cashier;
//        this.totalSales = totalSales;
        cashiers = new ArrayList<>();
    }
    //    public Manager(String name, int age, String gender) {
//        super(name, age, gender);
//        totalSales = 0.0;
//        this.cashiers = new ArrayList<>();
//        this.productBought = new ArrayList<>();
//    }

//    public ArrayList<Product> getProductBought() {
//        return productBought;
//    }

    public void hireCashier(Cashier cashier) {
        this.cashiers.add(cashier);
        System.out.println("Manager is hiring " + cashier.getName() + " as a new cashier.");
        System.out.println(cashier.getName() + " has been hired.");
    }
    public void fireCashier(Cashier cashier) {
        if (cashiers.contains(cashier)) {
            cashiers.remove(cashier);
            System.out.println("The manager is firing " + cashier.getName() + ", one of the cashiers.");
            System.out.println(cashier.getName() + " has been fired.");
        } else {
            System.out.println(cashier.getName() + " is not a staff of this store.");
        }
    }
//    public void addCashier(Cashier cashier) {
//        cashiers.add(cashier);
//    }

    public void displayCashiers() {
        if(cashiers.size() == 0) {
            System.out.println("No cashier is presently employed.");
        } else {
            System.out.println("List of Cashiers:");
            for (Cashier cashier : cashiers) {
                System.out.println(cashier.getName());
            }
        }
    }
    public void receiveSalesReport(String salesReport) {
        System.out.println(salesReport);
    }
//    public void requestSalesReport() {
//        // Call the getCashierSalesReport() method on the Cashier object
//        String salesReport = cashier.getCashierSalesReport();
//
//        // Print the sales report to the console
//        System.out.println("Sales Report:\n" + salesReport);
//    }
    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }
//    public void getSalesReport(Cashier cashier) {
////        double  = cashier.getTotalSales();
//        System.out.println("Sales report received from " + cashier.getName());
//        for(Product product : productBought) {
//            System.out.println(product.getName()+ ": " + product.getPrice());
//        }
//        System.out.println("Total sales: " + getTotalSales());
//        System.out.println("Daily sales report from " + cashier.getName() + ":");
//        System.out.println("Total sales for today: $ " + cashier.getTotalStock());
//        System.out.println("Total product sold: " + cashier.getTotalProductSold());

//    }
//    public double getTotalStock() {
//        double totalStock = 0;
//        for(Product product : productSold) {
//            totalStock += product.getPrice();
//        }
//        return totalStock;
//    }
//    public double getTotalSales() {
//        return totalSales;
//    }

    @Override
    public void performJob() {
        System.out.println("The manager is managing the store.");
    }

}
