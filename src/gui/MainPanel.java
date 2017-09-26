package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 26-Sep-17.
 */
public class MainPanel extends JPanel
{
	private BoardPanel boardPanelFriendly;
	private BoardPanel boardPanelEnemy;
	private ControlPanel controlPanel;
	private ScorePanel scorePanelFriendly;
	private ScorePanel scorePanelEnemy;

	public MainPanel()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(new GridBagLayout());

		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=100;
		gbc.weighty=100;

		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		gbc.weightx=100;
		boardPanelFriendly = new BoardPanel();
		boardPanelFriendly.setBorder(BorderFactory.createEtchedBorder());
		boardPanelFriendly.setMinimumSize(new Dimension(160,160));
		add(boardPanelFriendly, gbc);

		gbc.gridx++;

		gbc.anchor = GridBagConstraints.LINE_START;
		controlPanel = new ControlPanel();
		gbc.weightx=30;
		gbc.gridheight=2;
		controlPanel.setBorder(BorderFactory.createEtchedBorder());
		controlPanel.setMinimumSize(new Dimension(160,160));
		add(controlPanel, gbc);

		gbc.gridx++;

		gbc.anchor=GridBagConstraints.FIRST_LINE_END;
		gbc.weightx=100;
		gbc.gridheight=1;
		boardPanelEnemy = new BoardPanel();
		boardPanelEnemy.setBorder(BorderFactory.createEtchedBorder());
		boardPanelEnemy.setMinimumSize(new Dimension(160,160));
		add(boardPanelEnemy, gbc);

		gbc.gridy++;
		gbc.gridx=0;
		gbc.anchor=GridBagConstraints.LAST_LINE_START;
		gbc.weighty=20;
		gbc.weightx=100;
		scorePanelFriendly = new ScorePanel();
		scorePanelFriendly.setBorder(BorderFactory.createEtchedBorder());
		scorePanelFriendly.setMinimumSize(new Dimension(160,160));
		add(scorePanelFriendly, gbc);

		gbc.gridx+=2;
		gbc.anchor=GridBagConstraints.LAST_LINE_END;
		gbc.weightx=100;
		gbc.gridheight=1;
		scorePanelEnemy = new ScorePanel();
		scorePanelEnemy.setBorder(BorderFactory.createEtchedBorder());
		scorePanelEnemy.setMinimumSize(new Dimension(160,160));
		add(scorePanelEnemy, gbc);

	}
}
