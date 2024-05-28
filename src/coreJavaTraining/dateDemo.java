package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();		
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");		
		System.out.println(sdf.format(d));

		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyy hh:mm:ss");		
		System.out.println(sd.format(d));
		
		

	}

}
