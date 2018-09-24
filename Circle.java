package com.homework.board;

public class Circle extends Shape{
	private Point a;
	private Point b;
	
	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Circle() {
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

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getA().line(getB()),2);
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.getA().line(getB());
	}
	
}
