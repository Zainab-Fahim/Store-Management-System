package StoreManagementSystem;

import java.util.Scanner;

public class Main {
    public static void staffLogin(Store store){
        Scanner scanner = new Scanner(System.in);
        Staff staff = new Staff(store);
        int staffChoice;

        do {
            System.out.println("Staff Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Modify Product");
            System.out.println("4. Display Stock Balance Report");
            System.out.println("5. Quit Staff Menu");
            System.out.print("Enter your choice: ");

            staffChoice = scanner.nextInt();

            switch (staffChoice) {
                case 1:
                    staff.addProduct();
                    break;
                case 2:
                    staff.removeProduct();
                    break;
                case 3:
                    staff.modifyProduct();
                    break;
                case 4:
                    staff.displayStockBalanceReport();
                    break;
                case 5:
                    System.out.println("Quiting Staff Menu");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (staffChoice != 5);
    }
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer(store);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Staff Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Quit Store Management System");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    staffLogin(store);
                    break;
                case 2:
                    System.out.println("Products:");
                    customer.displayProducts();
                    break;
                case 3:
                    System.out.println("3. Quit Store Management System");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
