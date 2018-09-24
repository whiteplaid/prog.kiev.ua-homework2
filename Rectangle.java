package com.homework.board;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Rectangle() {
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
	public Point getD() {
		return d;
	}
	public void setD(Point d) {
		this.d = d;
	}
	@Override
	public double getArea() {
		return this.getA().line(getB())*this.getC().line(getD());
	}
	@Override
	public double getPerimetr() {
		return this.getA().line(getB()) + this.getC().line(getD()) * 2;
	}
	
	

}
