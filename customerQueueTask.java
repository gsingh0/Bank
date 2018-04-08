package bank;

import java.util.TimerTask;

public class customerQueueTask extends TimerTask {
	//pre: none due to no parameters
	//post: adds a new customer to a queue
	public void run() {
		bank.customerQueue.add(new customer());
		bank.totalCustomers++;
		System.out.println();
		System.out.println("Counter: " + bank.programclock);
		System.out.println("Customer Queue: " + bank.customerQueue.toString());
		
		if (bank.programclock == 0) {
			cancel();
		}
		
	}
}
