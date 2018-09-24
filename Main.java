package com.homework.board;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(5,7);
		Point p3 = new Point(2,5);
		Point p4 = new Point(11,2);
		Triangle triangle = new Triangle(p1,p2,p3);
		Circle circle = new Circle(p1,p2);
		Rectangle rectangle = new Rectangle(p1,p2,p3,p4);
		Square square = new Square(p1,p2,p3,p4);
		Board board = new Board();
		Shape[] shapes =  {triangle,rectangle,circle,square};
		for (int i = 0; i < board.getBoard().length; i++) {
			board.putFigure(shapes[i], i);
			
		}	
		board.print();
		for (int i = 0; i < board.getBoard().length;i++) {
			if (board.getBoard()[i] == triangle) {
				board.deleteFigure(triangle, i);
			}
		}
		
		board.print();
	}

}
