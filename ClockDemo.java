package prClock;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClockDemo {
	public static void main(String[] args){
		ClockView clockView = new ClockPanel1();
		Clock clock = new Clock(clockView);
		clock.start();
		
		JFrame window = new JFrame("Clock");  	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane((JPanel) clockView);		 
		//window.pack();
		window.setSize(new Dimension(250,100));
		window.setVisible(true);
		window.setResizable(false);
		
		ImageIcon img = new ImageIcon("clock.png");
		window.setIconImage(img.getImage());
	}
}
