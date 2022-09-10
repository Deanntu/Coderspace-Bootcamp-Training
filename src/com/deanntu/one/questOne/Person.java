package com.deanntu.one.questOne;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String email;
	public Person() {}
	public Person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person(String firstName,String lastName, String email){
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return firstName + lastName;
	}
	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Selam";
	}
}
