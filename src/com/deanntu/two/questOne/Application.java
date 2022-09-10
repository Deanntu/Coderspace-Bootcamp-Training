package com.deanntu.two.questOne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanChoice();
            try { 
                handleChoice(choice);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    private static void handleChoice(int choice) throws IOException {
        System.out.println("Hangling : " + choice);
        switch (choice) {

            case 1:
                new Thread(() -> {
                    try {
                        load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                        .start();

                break;
            case 2:
                new Thread(() -> {
                    try {
                        store();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                        .start();

                break;
            case 3:
                list();
                break;
            case 4:
                find();
                break;
            case 5:
                add();
                break;
            case 6:
                update();
                break;
            case 7:
                delete();
                break;
            case 0:
                doExit();
                break;
            default:
                System.out.println("Invalid Opreation: " + choice);
        }
    }

    private static void load() throws IOException {
        SupplierFiler supplierFiler = openPath();
        supplierList = supplierFiler.load();

    }

    private static SupplierFiler openPath() {
        String path = "C:\\Users\\TUGRADEMIREL19\\eclipse-workspace\\"
        		+ "Coderspace-Bootcamp-Training-01\\src\\com\\deanntu\\"
        		+ "two\\questOne\\Suppliers.txt";
        SupplierFiler supplierFiler = new SupplierFiler(path);
        return supplierFiler;
    }

    private static void store() throws IOException {
        SupplierFiler supplierFiler = openPath();
        supplierFiler.store(supplierList);

    }

    private static void list() {
        for (Supplier supplier : supplierList) {
            System.out.println(supplier.getSupplierID() + " "
                    + supplier.getSupplierName() + " "
                    + supplier.getTotalCredit());
        }
    }

    private static void find() {
        System.out.println("Bulmak istediğiniz satıcının ID numarasını giriniz: ");
        long l = scanner.nextLong();
        Supplier supplier = finder(supplierList, l);
        if (supplier == null) {
            System.out.println("Supplier not found.");
        } else {
            System.out.println(supplier.getSupplierID() + " "
                    + supplier.getSupplierName() + " "
                    + supplier.getTotalCredit());
        }
    }
    private static boolean silenceFinder(long SupplierID) {
    	Supplier supplier = finder(supplierList, SupplierID);
    	if (supplier != null) {
    		return true;
    	}
		return false;
    }
    private static Supplier finder(List<Supplier> supplierList, long supplierId) {
        for (Supplier supplier : supplierList) {
            if (supplier.getSupplierID() == supplierId) {
                return supplier;
            }
        }
        return null;
    }

    private static void add() throws IOException {
        System.out.println("The Supplier you want to add:");
        System.out.println("Enter the ID number.");
        long l = scanner.nextLong();
        boolean existCheck = silenceFinder(l);
        System.out.println(existCheck);
        if(existCheck) {
        	System.out.println("Girmiş olduğunuz ID ile eşleşen bir kullanıcı bulundu, kullanıcıyı güncellemek istiyor musunuz?");
        	System.out.println("1. Evet\n2. Hayır");
        	int check = scanner.nextInt();
        	if(check != 2 && check != 1) {
        		System.out.println(check);
        		System.out.println("Hatalı tuşlama yapıldı ana menüye dönülüyor!");
        		return; 
        	}
        	else if(check == 2) {
        		return;
        	}
        	else {
        		update();
        		return;
        	}
        }
        scanner.nextLine();
        System.out.println("Enter First and Last Name:");
        String s = scanner.nextLine();
        System.out.println("Enter Total Credits: ");
        double d = scanner.nextDouble();
        Supplier supplier = new Supplier(l, s, d);
        supplierList.add(supplier);
        store();

    }

    private static void update() {
        System.out.println("The Supplier you want to update:");
        System.out.println("Enter the ID number.");
        long l = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter New First and Last Name:");
        String s = scanner.nextLine();
        System.out.println("Enter New Total Credits: ");
        double d = scanner.nextDouble();
        Supplier supplier = finder(supplierList, l);
        if (supplier == null) {
            System.out.println("Supplier not found.");
        } else {
            supplier.setSupplierName(s);
            supplier.setTotalCredit(d);
        }
    }

    private static void delete() {
        System.out.println("The Supplier you want to delete:");
        System.out.println("Enter the ID number.");
        long l = scanner.nextLong();
        Supplier supplier = finder(supplierList, l);
        if (supplier == null) {
            System.out.println("Supplier not found.");
        } else {
            supplierList.remove(supplier);
        }
    }

    private static void doExit() {
        System.exit(0);
    }

    private static int scanChoice() {
        int choice = scanner.nextInt();
        System.out.println("Choice: " + choice);
        return choice;
    }

    private static void printMenu() {
        System.out.println("-------------------------");
        System.out.println("MENU:");
        System.out.println("1. Upload");
        System.out.println("2. Store");
        System.out.println("3. List");
        System.out.println("4. Find");
        System.out.println("5. Add");
        System.out.println("6. Update");
        System.out.println("7. Delete");
        System.out.println("0. Exit");
        System.out.println(" ");
        System.out.println("CHOOSE:");
        System.out.println();
    }

    private static Scanner scanner = new Scanner(System.in);
    private static List<Supplier> supplierList = new ArrayList<>();
}