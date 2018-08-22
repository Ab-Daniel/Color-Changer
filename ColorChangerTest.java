import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class ColorChangerTest 
{
	
	
	
	public static void main(String[] args) 
	{
		
		
		windowPanel = new JPanel();
		
		JFrame windowFrame = new JFrame();
		windowFrame.setSize(300, 100);
		windowFrame.setTitle("Color CHange Window");
		windowFrame.add(windowPanel);
		windowFrame.setVisible(true);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		redButton = new JButton();
		yellowButton = new JButton();
		greenButton = new JButton();
		
		
		controlPanel = new JPanel();
		
		JFrame controlFrame = new JFrame();
		controlFrame.setSize(500, 500);
		controlFrame.setTitle("Control Panel");
		controlFrame.add(controlPanel);
		controlPanel.add(redButton);
		controlPanel.add(yellowButton);
		controlPanel.add(greenButton);
		controlFrame.setVisible(true);
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.pack();
		
	}
	
	public ColorChangerTest()
	{
	
		class RedButtonListener implements ActionListener
		{   
			public void actionPerformed(ActionEvent event)   
			{
			
				windowPanel.setBackground(Color.red);   
			
			}
		
		}
		
		ActionListener redListener = new RedButtonListener();
		redButton.addActionListener(redListener);
	
	}
		
	private static JPanel windowPanel;
	private static JPanel controlPanel;
	
	private static JButton redButton;
	private static JButton yellowButton;
	private static JButton greenButton;
	
}
