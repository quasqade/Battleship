import events.ModelListener;
import events.ViewListener;
import gui.GUIListener;
import gui.MainFrame;
import logic.GameModelListener;

import javax.swing.*;

/**
 * Created by user on 26-Sep-17.
 */
public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{

				MainFrame mainFrame = new MainFrame("Battleship");
			}
		});
	}
}
