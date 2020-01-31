import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	 Date date1;																						//勤務ボタン実行時の日時(date型)
	 Date date2;																						//退勤ボタン実行時の日時(date型)
	long nowStart1;																				//勤務ボタン実行時の日時（long型)
	long nowStop2;																				//退勤ボタン実行時の日時（long型)

	 public long timer(long nowStart, long nowStop ) {

		this.nowStart1 =  date1.getTime();
		this.nowStop2 =  date2.getTime();

		long timeDiff = (nowStop - nowStart);

		 return timeDiff;																			//勤務時間


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

		 long timeDiff = timer(this.nowStart1, this.nowStop2);					//timerメソッドの戻り値
		 System.out.println(timeDiff);
	 }


	 }




