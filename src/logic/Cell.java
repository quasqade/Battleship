package logic;

import common.CellState;

public class Cell {
	private CellState cellState;
	private int x;
	private int y;

	public Cell(CellState cellState, int x, int y)
	{
		this.cellState=cellState;
		this.x=x;
		this.y=y;
	}

	public void setCellState(CellState state)
	{
		this.cellState = state;
	}

	public CellState getCellState() {
		return cellState;
	}
}
