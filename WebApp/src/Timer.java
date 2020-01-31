import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class Timer extends Object implements Serializable{
	 int delay = 1000; //milliseconds
	  ActionListener taskPerformer = new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	            																															//Timeクラス呼び出し
	           System.out.println(Time.Timeset1.sdf1.format(date) - Time.Timeset2().sdf2.format(date));			//クリック時の時間の差
	           
	      }
	  };
	  
}
	  


