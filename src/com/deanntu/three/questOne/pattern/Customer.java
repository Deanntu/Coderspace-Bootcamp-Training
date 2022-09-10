package com.deanntu.three.questOne.pattern;

public class Customer {

	private long customerID;
	private String customerName;
	private double totalDebit;
	
	public Customer(long customerID, String customerName, double totalDebit) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.totalDebit = totalDebit;
	}

	public Customer() {
	}

	public long getCustomerID() {
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

	public double getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(int totalDebit) {
		this.totalDebit = totalDebit;
	}
}