package com.homework.board;

public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double line(Point two) {
		return Math.sqrt(Math.pow(this.getX()-two.getX(), 2)+
				Math.pow(this.getY()-two.getY(), 2));
	}
}
