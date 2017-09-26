package logic;

import events.AbortEvent;
import events.ModelListener;

import java.util.EventObject;

/**
 * Created by user on 26-Sep-17.
 */
public class GameModelListener implements ModelListener
{
	private Game game;
	public GameModelListener(Game game)
	{
		this.game=game;
	}
@Override
public void eventFired(EventObject ev)
{
if (ev instanceof AbortEvent)
{
game.handleAbortEvent((AbortEvent) ev);
}
}
}
