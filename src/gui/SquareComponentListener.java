package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * Created by user on 26-Sep-17.
 */
public class SquareComponentListener implements ComponentListener
{
@Override
public void componentResized(ComponentEvent e)
{
	int W = 5;
	int H = 3;
	Rectangle b = e.getComponent().getBounds();
	e.getComponent().setBounds(b.x, b.y, b.width, b.width*H/W);
	JFrame frame = (JFrame)e.getSource();
	frame.paint(frame.getGraphics());
}

@Override
public void componentMoved(ComponentEvent e)
{

}

@Override
public void componentShown(ComponentEvent e)
{

}

@Override
public void componentHidden(ComponentEvent e)
{

}
}
