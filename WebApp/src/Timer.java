import java.io.Serializable;
import java.awt.event.ActionListener;


public class Timer extends Object implements Serializable{
	 int delay = 1000; //milliseconds
	  ActionListener taskPerformer = new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	          //...Perform a task...
	      }
	  }
	  
	 
	  new Timer(delay, taskPerformer).start();
	  
	  new Timer(delay, taskPerfomer).stop();

}
