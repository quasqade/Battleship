package logic;

import common.CellState;

public class GameBoard {
	private Cell[][] boardArray;
	private int width;
	private int height;

	public GameBoard(int width, int height)
	{
		boardArray = new Cell[width][height];
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				boardArray[i][j] = new Cell(CellState.EMPTY, i, j);
			}
		}
		this.width = width;
		this.height = height;
		boardArray[0][0].setCellState(CellState.SUNK);
	}

	public void printBoard() {
		for (int i = 0; i < width+1; i++)
		{
			System.out.printf("%2s", "=");
		}
		System.out.println();
		for (int i = 0; i < height; i++)
		{
			System.out.printf("%2s", "|");
			for (int j = 0; j < width; j++)
			{
				switch (boardArray[i][j].getCellState())
				{
					case EMPTY:
					{
						System.out.printf("%2s", "|");
						break;
					}
					case OCCUPIED:
					{
						System.out.printf("%2s", "X|");
						break;
					}
					case SHELLED:
					{
						System.out.printf("%2s", ".|");
						break;
					}
					case SUNK:
					{
						System.out.printf("%2s", "D|");
						break;
					}
				}
			}
			System.out.println();
		}
		for (int i = 0; i < width+1; i++)
		{
			System.out.printf("%2s", "=");
		}
		System.out.println();
	}
}
