package StoreManagementSystem;

public class Customer {
    private Store store;

    public Customer(Store store) {
        this.store = store;
    }

    public void displayProducts() {
        System.out.println("+----------------+---------+-------+-----------+");
        System.out.println("| Product Name   | Quantity | Price | Total Value |");
        System.out.println("+----------------+---------+-------+-----------+");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }
    }
}

