import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangerTest extends JComponent
{
	
	
	
	public static void main(String[] args) 
	{
		
		
		
		JFrame windowFrame = new JFrame();
		windowFrame.setSize(300, 100);
		windowFrame.setTitle("Color CHange Window");
		windowFrame.add(windowPanel);
		windowFrame.setVisible(true);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		redButton = new JButton("red");
		yellowButton = new JButton("blue");
		greenButton = new JButton("green");
		
		
		JFrame controlFrame = new JFrame();
		controlFrame.setSize(150, 150);
		controlFrame.setTitle("Control Panel");
		controlFrame.add(controlPanel);
		controlPanel.add(redButton);
		controlPanel.add(yellowButton);
		controlPanel.add(greenButton);
		controlFrame.setVisible(true);
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.pack();
		
	}
	

	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics2D g2 =  (Graphics2D)g;
		
		
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
	
	final static JPanel windowPanel = new JPanel();
	final static JPanel controlPanel = new JPanel();
	
	
	//final JPanel windowPanel;
	//private static JPanel controlPanel;
	
	private static JButton redButton;
	private static JButton yellowButton;
	private static JButton greenButton;
	
}
