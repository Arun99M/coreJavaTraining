package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyy hh:mm:ss");		

		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM));

		System.out.println(cal.get(Calendar.APRIL));

		System.out.println(cal.get(Calendar.DAY_OF_YEAR));


	}

}
