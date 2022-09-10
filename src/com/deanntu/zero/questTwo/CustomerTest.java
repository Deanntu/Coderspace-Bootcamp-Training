package com.deanntu.zero.questTwo;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer cust =new Customer(501,"Neset Ertas",4350);
		Customer cust1 =new Customer(216,"Arif V",700);
		Customer cust2 =new Customer(2008,"Lich King",0);
		Customer cust3 =new Customer(128,"Malum",128);
		customers.add(cust);
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		for(Customer x:customers) {
			printCustomer(x);
		}
	}
	private static void printCustomer(Customer customer) {
		System.out.println("Musteri ID: "+customer.getCustomerID());
		System.out.println("Musteri Adi: "+customer.getCustomerName());
		System.out.println("Musteri Total Borcu: "+customer.getTotalDebit());
	}
}