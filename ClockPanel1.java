package prClock;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockPanel1 extends JPanel implements ClockView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel time;
	private JLabel date;
	public ClockPanel1(){
		time=new JLabel("00:00:00 AM");
		date=new JLabel("00-00-00");
		Font timeFont = new Font("Calibri", Font.BOLD, 40);
		Font dateFont = new Font("Calibri", Font.BOLD, 30);
		time.setFont(timeFont);
		date.setFont(dateFont);
		setLayout(new GridLayout(2,1));
		JPanel timePanel = new JPanel();
		timePanel.setLayout(new GridBagLayout());
		timePanel.add(time);
		
		JPanel datePanel = new JPanel();
		datePanel.setLayout(new GridBagLayout());
		datePanel.add(date);
		
		add(timePanel);
		add(datePanel);
	}
	
	public void changeTime(String time) {
		this.time.setText(time);
	}
	public void chageDate(String date){
		this.date.setText(date);
	}
}
