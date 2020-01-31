import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	 Date date1;
	 Date date2;
	long nowStart1;
	long nowStop2;

	 public long timer(long nowStart, long nowStop ) {

		this.nowStart1 =  date1.getTime();
		this.nowStop2 =  date2.getTime();

		long timeDiff = (nowStop - nowStart);

		 return timeDiff;


	 }

	 public void timeSet1() {

		  this.date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(sdf1.format(date1));



        	}

	public void timeSet2() {

		this.date2 = new Date();
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(sdf2.format(date2));

		 long timeDiff = timer(this.nowStart1, this.nowStop2);
		 System.out.println(timeDiff);
	 }


	 }




