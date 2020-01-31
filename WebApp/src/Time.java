import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	
	
	Date date = new Date();

	 static void timeSet1() {
		 Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(sdf1.format(date));
        long sdf1Start = Date.getTime();
        
        
        	}

	static void timeSet2() {
		Date date = new Date();
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(sdf2.format(date));
	 }
	 
	 static SimpleDateFormat timer(SimpleDateFormat sdf1,SimpleDateFormat sdf2 ) {
		 SimpleDateFormat getTime = sdf1-sdf2;
	 }
	 }
        
	


