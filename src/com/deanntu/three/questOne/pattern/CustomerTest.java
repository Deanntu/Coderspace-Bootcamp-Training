package com.deanntu.three.questOne.pattern;

public class CustomerTest {
    public static void main(String[] args) {
        try {
            CustomerManager customerManager = new CustomerManager();
            Customer customer = new Customer(1, "Zeki Müren", 5662);
            boolean isInserted= customerManager.insert(customer);
            if (isInserted)
                System.out.println("Added.");
            else
                System.out.println("Failed.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}