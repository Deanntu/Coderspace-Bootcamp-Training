package com.deanntu.zero.questOne;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public Circle() {
		this(1.0);
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2.0*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}