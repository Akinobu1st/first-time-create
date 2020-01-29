import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	static void Timeset() {
        	Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.println(sdf1.format(date));
        }
	}

      
