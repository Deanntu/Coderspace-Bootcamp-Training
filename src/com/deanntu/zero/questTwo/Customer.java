package com.deanntu.zero.questTwo;

public class Customer {

	private int customerID;
	private String customerName;
	private int totalDebit;
	
	public Customer(int customerID, String customerName, int totalDebit) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.totalDebit = totalDebit;
	}

	public Customer() {
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerId) {
		this.customerID = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(int totalDebit) {
		this.totalDebit = totalDebit;
	}
}