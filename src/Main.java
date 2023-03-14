import com.alaoabdulhakeem.Cashier;
import com.alaoabdulhakeem.Customer;
import com.alaoabdulhakeem.Manager;
import com.alaoabdulhakeem.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConvenienceStore store = new ConvenienceStore();

        Product product1 = new Product("ball", 40.00, 10);
        Product product2 = new Product("shirt", 70.20, 8);
        Product product3 = new Product("pen", 10.50, 10);

        ConvenienceStore convenienceStore = new ConvenienceStore();
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        product1.addQuantity(5);
        product1.reduceQuantity(3);
        product3.reduceQuantity(1);

        Manager manager = new Manager("John", 40, "male");
        Cashier cashier1 = new Cashier("Mark", 30, "male");
        Cashier cashier2 = new Cashier("Ade", 29, "male");
        Cashier cashier3 = new Cashier("Shade", 33, "female");


        manager.hireCashier(cashier1);
        manager.hireCashier(cashier2);
        manager.hireCashier(cashier3);

        manager.fireCashier(cashier2);
//        manager.addCashier(cashier1);
//        manager.addCashier(cashier2);
        manager.displayCashiers();

//        manager.getSalesReport(cashier1);
//        manager.getSalesReport(cashier2);
//        manager.requestSalesReport();

        manager.performJob();

//        Cashier cashier = new Cashier("Mark", 30, "male");
//        cashier1.recordSale(50);
//        cashier2.recordSale(100);

        cashier1.giveSalesReport(manager);
        cashier2.giveSalesReport(manager);

        cashier1.sellProduct(product1, 5);
        cashier2.sellProduct(product2, 4);
        cashier1.sellProduct(product3, 2);

        cashier1.getTotalPrice();
        cashier2.getTotalPrice();
//        cashier.salesReport();

        Customer customer1 = new Customer("Joy", cashier1);
        Customer customer2 = new Customer("Sola", cashier2);
        Customer customer3 = new Customer("Titi", cashier1);

        customer1.buyProduct(product1, cashier1, 2);
        customer2.buyProduct(product2, cashier2, 1);
        customer3.buyProduct(product3, cashier1, 1);

        customer1.addProductBought(product1, 2);
        customer3.addProductBought(product3, 2);
        customer1.getTotalPrice();

        System.out.println(customer1.getName() + " wants to buy " + product1.getName() + " from " + cashier1.getName() + ".");
        cashier1.sellProduct(product1, 3);
        System.out.println(customer1.getName() + " bought " + product1.getQuantity() + " " + product1.getName() +
                " from " + cashier1.getName() + " at $" + product1.getPrice() + " each.");
        System.out.println(customer2.getName() + " wants to buy " + product2.getName() + " from " + cashier2.getName() + ".");
        cashier2.sellProduct(product2, 1);
        System.out.println(customer2.getName() + " bought " + product2.getQuantity() + " " + product2.getName() +
                " from " + cashier2.getName() + " at $" + product2.getPrice() + " each.");
        System.out.println(customer1.getName() + " wants to buy " + product3.getName() + " from " + cashier1.getName() + ".");
        cashier1.sellProduct(product3, 1);
        System.out.println(customer1.getName() + " bought " + product3.getQuantity() + " " + product3.getName() +
                " from " + cashier2.getName() + " at $" + product1.getPrice() + " each.");
//        Product product4 = new Product("milk", 5.66, 4);
//        convenienceStore.addProduct(product4);

        cashier1.dispenseReceipt(customer1);
        cashier2.dispenseReceipt(customer2);
        cashier1.dispenseReceipt(customer3);

        System.out.println("Receipt for " + customer1.getName() + ":");
        System.out.println(customer1.dispenseReceipt());
        System.out.println(customer2.dispenseReceipt());
        System.out.println(customer3.dispenseReceipt());

        ArrayList<Product> products = cashier1.getProductsSold();
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " sold for $" +
                    product.getPrice() + " each.");
        }
        cashier1.performJob();
        cashier2.performJob();

        System.out.println("Store inventory:");
        for (Product product : store.getProducts()) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " in stock.");
        }


    }
}