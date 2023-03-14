import com.alaoabdulhakeem.Cashier;
import com.alaoabdulhakeem.Customer;
import com.alaoabdulhakeem.Manager;
import com.alaoabdulhakeem.Product;

import java.util.ArrayList;

public class ConvenienceStore {
    private Manager manager;
    private ArrayList<Cashier> cashiers;
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;

    public ConvenienceStore() {
        manager = new Manager("John", 40, "male");
        cashiers = new ArrayList<>();
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void hireCashier(Cashier cashier) {
        cashiers.add(cashier);
    }
    public void fireCashier(Cashier cashier) {
        cashiers.remove(cashier);
    }
    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }
    public Manager getManager() {
        return manager;
    }
}
