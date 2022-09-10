package com.deanntu.one.questTwo;

public class FunctionDrawer {
	void draw(MathFunction function, double x1, double x2, int n) {		
		double dx = (x1-x2)/n;
		double y;
		
		for(double x=x1 ; x<=x2 ; x+=dx) {
			y=function.evaluate(x);
			System.out.println("x: "+x+" y:"+y);
		}
		
	}
}
