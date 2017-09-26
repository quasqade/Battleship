package gui;

import events.ViewListener;

import java.util.EventObject;

/**
 * Created by user on 26-Sep-17.
 */
public class GUIListener implements ViewListener
{
	private MainFrame mainFrame;

	public GUIListener(MainFrame mainFrame)
	{
		this.mainFrame=mainFrame;
	}
@Override
public void eventFired(EventObject ev)
{

}
}
