package com.homework.board;

public class Board {
	private Shape[] board = new Shape[4];

	public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape[] getBoard() {
		return board;
	}

	public void setBoard(Shape[] board) {
		this.board = board;
	}
	public void putFigure (Shape one, int i) {
		
		if (i > 0 && i < board.length && board[i] == null) {
			board[i] = one;
		}else {
			System.out.println("There is no space to put this figure on board");
		}
	}
	public void deleteFigure (Shape one, int i) {
		if (i > 0 && i < board.length && board[i] != null) {
		board[i] = null;
		} else {
			System.out.println("There is no figure at position: " + i);
		}
	}
	public double print () {
		double area = 0.0;
		System.out.println("Figures on board:");
		for (int i = 0; i < board.length;i++) {
			if (board[i] != null) {
			System.out.println(board[i].getClass().getSimpleName());
			area += board[i].getArea();
			}
			
		}
		System.out.println("The area of all this figures is: " + area);
		return area;
		
	}
}
