import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	static  Date date1;
	static  Date date2;
	static long nowStart1;
	 static long nowStop2;


	 static void timeSet1() {

		 Date date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(sdf1.format(date1));



        	}

	 static void timeSet2() {

		Date date2 = new Date();
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(sdf2.format(date2));
	 }

	 static long timer(long nowStart1, long nowStop2 ) {

		 nowStart1 =  date1.getTime();
		 nowStop2 =  date2.getTime();

		long timeDiff = (nowStop2 - nowStart1);


		 return timeDiff;


	 }
	 }




