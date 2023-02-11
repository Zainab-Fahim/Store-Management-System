package StoreManagementSystem;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean removeProduct(Product product) {
        products.remove(product);
        return false;
    }

    public void modifyProduct(Product product, int quantity, double price) {
        product.setQuantity(quantity);
        product.setPrice(price);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getTotalValue();
        }
        return totalValue;
    }
}