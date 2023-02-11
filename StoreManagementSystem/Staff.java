package StoreManagementSystem;

import java.util.Scanner;

public class Staff {
    private Store store;
    private Scanner scanner;

    public Staff(Store store) {
        this.store = store;
        scanner = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        Product product = new Product(name, quantity, price);
        store.addProduct(product);
        System.out.println("Product added successfully.");
    }
    public void removeProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product productToRemove = null;
        for (Product product : store.getProducts()) {
            System.out.println(product.getName());
            if (product.getName().equals(name)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            boolean isRemoved = store.removeProduct(productToRemove);
            if (isRemoved) {
                System.out.println("Product removed successfully.");
            } else {
                System.out.println("Failed to remove product.");
            }
        } else {
            System.out.println("Product not found.");
        }
    }

    public void modifyProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product productToModify = null;
        for (Product product : store.getProducts()) {
            System.out.println(product.getName());
            if (product.getName().equals(name)) {
                productToModify = product;
                break;
            }
        }

        if (productToModify != null) {
            System.out.print("Enter new quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            store.modifyProduct(productToModify, quantity, price);
            System.out.println("Product modified successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayStockBalanceReport() {
        System.out.println("+----------------+---------+-------+--------------+");
        System.out.println("| Product Name   | Quantity | Price | Total Value |");
        System.out.println("+----------------+---------+-------+--------------+");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }
        System.out.println("Total Value: " + store.getTotalValue());
    }
}

