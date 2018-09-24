package com.homework.board;

public class Triangle extends Shape{
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double getArea() {
		double halfPerimetr = this.getPerimetr() / 2;
		
		return Math.sqrt(halfPerimetr*(halfPerimetr - this.getA().line(getB()))*(halfPerimetr - this.getB().line(getC()))*(halfPerimetr - this.getC().line(getA())));
		
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return this.getA().line(getB())+this.getB().line(getC())+this.getC().line(getA());
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	

}
