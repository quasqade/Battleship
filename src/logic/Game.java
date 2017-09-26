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
	public Game(ViewListener viewListener)
	{
		this.viewListener=viewListener;
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
