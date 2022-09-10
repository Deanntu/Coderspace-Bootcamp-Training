package com.deanntu.one.questThree;

public class Account {
	
	private long accountId;
	private double amountLocal;
	private String accountName;
	
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAmountLocal() {
		return amountLocal;
	}
	public void setAmountLocal(double amountLocal) {
		this.amountLocal = amountLocal;
	}
	public void print() {
		System.out.printf("Account Id: "+this.getAccountId()
		  +" \nAccount Name: "+this.getAccountName()
		  +" \nAmount Local: "+this.getAmountLocal());
	}

}