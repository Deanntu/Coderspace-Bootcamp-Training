package com.deanntu.one.questOne;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Tugra","Demirel",123,7540);
		employee.setEmail("me@tugrademirel.com");
		sendEmail(employee);
	}
	private static void sendEmail(Person person) {
		System.out.println();
		System.out.println("Kime: "+person.getEmail());
		System.out.println("Konu: "+person.getGreetings());
		System.out.println("Gövde: "+person.getFullName());
	}

}
