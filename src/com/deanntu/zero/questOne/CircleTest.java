package com.deanntu.zero.questOne;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle=new Circle(3);
		circle.setRadius(3);
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
	}
}