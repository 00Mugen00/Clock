package prClock;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockPanel1 extends JPanel implements ClockView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel time;
	public ClockPanel1(){
		time=new JLabel("00:00:00 AM");
		Font font = new Font("Calibri", Font.BOLD, 40);
		time.setFont(font);
		setLayout(new GridBagLayout());
		add(time);
	}
	
	public void changeTime(String time) {
		this.time.setText(time);
	}
}
