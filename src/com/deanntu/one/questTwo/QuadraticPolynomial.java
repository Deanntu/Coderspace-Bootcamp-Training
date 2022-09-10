package com.deanntu.one.questTwo;

public class QuadraticPolynomial implements MathFunction {
	double a = 1;
	double b = 1;
	double c = 1;
	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return (a*x)+(b*x)+(c*x);
	}

}
