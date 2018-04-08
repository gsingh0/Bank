package bank;

import java.util.TimerTask;

public class programClock extends TimerTask {

	//pre: none due to no parameters
	//post: subtracts programclock data field by 1 every second
	public void run() {
		bank.programclock = bank.programclock - 1;
//		System.out.println(bank.programclock);
		if (bank.programclock == 0) {
			bank.programStatus = false;
			cancel();
		}
		
	}

}
