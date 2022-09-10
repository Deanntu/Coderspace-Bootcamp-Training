package com.deanntu.one.questTwo;

public class SinusoidalPolynomial implements MathFunction {
	private double m;
	private double w;
	private double p;
	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return m*Math.sin(w*x-p);
	}
	
}
