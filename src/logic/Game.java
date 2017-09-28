package logic;

import events.AbortEvent;
import events.ViewListener;

import java.util.EventObject;

/**
 * Created by user on 26-Sep-17.
 */
public class Game
{
private ViewListener viewListener;
private GameBoard friendlyBoard;
private GameBoard enemyBoard;

	public Game(ViewListener viewListener)
	{
		this.viewListener=viewListener;
		friendlyBoard = new GameBoard(10,10);
		enemyBoard = new GameBoard(10,10);
		friendlyBoard.printBoard();
	}



	//TODO replace with specific types
	public void handleGenericEvent(EventObject ev)
	{
		System.out.println("event handled");
	}

	public void handleAbortEvent(AbortEvent ev)
	{
		System.out.println("Abort event handled");
		System.exit(0);
	}
}
