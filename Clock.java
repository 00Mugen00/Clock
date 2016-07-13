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
			
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int month = calendar.get(Calendar.MONTH);
			int year = calendar.get(Calendar.YEAR);
			String date= day+"-"+month+"-"+year;
			
			
			clockView.changeTime(time);
			clockView.chageDate(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
