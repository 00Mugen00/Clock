package prClock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock extends Thread{
	private ClockView clockView;
	public Clock(ClockView clockView){
		this.clockView=clockView;
	}
	public void run(){
		while(true){
			Calendar calendar = new GregorianCalendar();
			int hour = calendar.get(Calendar.HOUR);
			int minutes = calendar.get(Calendar.MINUTE);
			int seconds = calendar.get(Calendar.SECOND);
			int am_pm = calendar.get(Calendar.AM_PM);
			String day_night="";
			if(am_pm==1){
				day_night="PM";
			}else{
				day_night="AM";
			}
			String time= hour+":"+minutes+":"+seconds+" "+day_night;
			clockView.changeTime(time);
		}
	}
}
