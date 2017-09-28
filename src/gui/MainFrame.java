package gui;

import events.AbortEvent;
import events.ModelListener;
import logic.Game;
import logic.GameModelListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 26-Sep-17.
 */
public class MainFrame extends JFrame
{
	private ModelListener modelListener;

	public MainFrame(String name)
	{
		super(name);

		Game game = new Game(new GUIListener(this));
		this.modelListener=new GameModelListener(game);

		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				if (JOptionPane.showConfirmDialog(MainFrame.this, "Are you sure you want to quit?", "Really quit?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
				{
					modelListener.eventFired(new AbortEvent(this));
				}
			}
		});
		setMinimumSize(new Dimension(640, 320));
		addComponentListener(new SquareComponentListener());
		Toolkit.getDefaultToolkit().setDynamicLayout(false);
		MainPanel mainPanel = new MainPanel();
		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
}
