package com.deanntu.one.questOne;

public class Employee extends Person{
	private long employeeID;
	private double monthlySalary;
	public Employee() {
		super();
	}
	public Employee(String firstName,String lastName,long employeeID, double monthlySalary) {
		super(firstName,lastName);
		this.employeeID = employeeID;
		this.monthlySalary = monthlySalary;
	}
	public Employee(String firstName, String lastName, String email, long employeeID, double monthlySalary) {
		super(firstName,lastName,email);
		this.employeeID = employeeID;
		this.monthlySalary = monthlySalary;
	}
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
