import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	Date now = new Date();//TIMEインスタンス作成
	SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//TIMEインスタンス作成
	
	
public boolean equals (Object o) { 
	if(o == this) return true;//equalsのオーバーライド
	return false;
	}
}
