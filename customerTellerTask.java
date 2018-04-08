package bank;

import java.util.TimerTask;

public class customerTellerTask extends TimerTask{
	
	//pre: none due to no pre-conditions
	//post: describes the actions when a teller dequeues a customer from a queue
	public void run()  {
		try {
		bank.teller[0].setAvailability(true);
		if (!bank.customerQueue.isEmpty()) {
			bank.teller[0].setNextCustomer(bank.customerQueue.poll());
			bank.totalTimeCustomerOccupied0 = bank.totalTimeCustomerOccupied0 + bank.teller[0].getCustomer().getTimeSpent();
			bank.customersHelped0++;
			bank.teller[0].setAvailability(false);
			System.out.println(bank.teller[0].getCustomer().toString() + " now with a teller.");
		}
		else  {
			bank.teller[0].getCustomer().setTimeSpent(); //do not add to total customer visited
		}
		
		
		if (bank.programclock == 0) {
			cancel();
		}
		}
		catch (NullPointerException e) {
			bank.teller[0].setNextCustomer(new customer());
			bank.teller[0].getCustomer().setTimeSpent();
		}
	}

}

class customerTellerTask1 extends TimerTask {
	//pre: none due to no pre-conditions
	//post: describes the actions when a teller dequeues a customer from a queue
	public void run()  {
		try {
		bank.teller[1].setAvailability(true);
		if (!bank.customerQueue.isEmpty() && bank.tellerAvailability(0) == false) {
			bank.teller[1].setNextCustomer(bank.customerQueue.poll());
			bank.totalTimeCustomerOccupied1 = bank.totalTimeCustomerOccupied1 + bank.teller[1].getCustomer().getTimeSpent();
			bank.customersHelped1++;
			bank.teller[1].setAvailability(false);
			System.out.println(bank.teller[1].getCustomer().toString() + " now with a teller.");
		}
		else {
			bank.teller[1].getCustomer().setTimeSpent(); //do not add to total customer visited
		}
		
			
			
		if (bank.programclock == 0) {
			cancel();
		}
		}
		catch (NullPointerException e) {
			bank.teller[1].setNextCustomer(new customer());
			bank.teller[1].getCustomer().setTimeSpent();
		}
		
	}
	
}

class customerTellerTask2 extends TimerTask {
	//pre: none due to no pre-conditions
	//post: describes the actions when a teller dequeues a customer from a queue
	public void run() {
		try {
		bank.teller[2].setAvailability(true);
		if (!bank.customerQueue.isEmpty() && bank.tellerAvailability(1) == false) {
			bank.teller[2].setNextCustomer(bank.customerQueue.poll());
			bank.totalTimeCustomerOccupied2 = bank.totalTimeCustomerOccupied2 + bank.teller[2].getCustomer().getTimeSpent();
			bank.customersHelped2++;
			bank.teller[2].setAvailability(false);
			System.out.println(bank.teller[2].getCustomer().toString() + " now with a teller.");
		}
		else  {
			bank.teller[2].getCustomer().setTimeSpent(); //do not add to total customer visited
		}
			
			
		if (bank.programclock == 0) {
			cancel();
		}
		}
		catch (NullPointerException e) {
			bank.teller[2].setNextCustomer(new customer());
			bank.teller[2].getCustomer().setTimeSpent();
		}
		
	}
	
}

class customerTellerTask3 extends TimerTask {
	//pre: none due to no pre-conditions
	//post: describes the actions when a teller dequeues a customer from a queue
	public void run() {
		try {
		bank.teller[3].setAvailability(true);
		if (!bank.customerQueue.isEmpty() && bank.tellerAvailability(2)) {
			bank.teller[3].setNextCustomer(bank.customerQueue.poll());
			bank.totalTimeCustomerOccupied3 = bank.totalTimeCustomerOccupied3 + bank.teller[3].getCustomer().getTimeSpent();
			bank.customersHelped3++;
			bank.teller[3].setAvailability(false);
			System.out.println(bank.teller[3].getCustomer().toString() + " now with a teller.");
		}
		else  {
			bank.teller[3].getCustomer().setTimeSpent(); //do not add to total customer visited
		}
			
			
		if (bank.programclock == 0) {
			cancel();
		}
		}
		catch (NullPointerException e) {
			bank.teller[3].setNextCustomer(new customer());
			bank.teller[3].getCustomer().setTimeSpent();
		}
		
	}
	
}

class customerTellerTask4 extends TimerTask {
	//pre: none due to no pre-conditions
	//post: describes the actions when a teller dequeues a customer from a queue
	public void run() {
		try {
		bank.teller[4].setAvailability(true);
		if (!bank.customerQueue.isEmpty() && bank.tellerAvailability(3) == false) {
			bank.teller[4].setNextCustomer(bank.customerQueue.poll());
			bank.totalTimeCustomerOccupied4 = bank.totalTimeCustomerOccupied4 + bank.teller[4].getCustomer().getTimeSpent();
			bank.customersHelped4++;
			bank.teller[4].setAvailability(false);
			System.out.println(bank.teller[4].getCustomer().toString() + " now with a teller.");
			
		}
		else  {
			bank.teller[4].getCustomer().setTimeSpent(); //do not add to total customer visited
		}
			
			
		if (bank.programclock == 0) {
			cancel();
		}
		}
		catch (NullPointerException e) {
			bank.teller[4].setNextCustomer(new customer());
			bank.teller[4].getCustomer().setTimeSpent();
		}
		
	}
	
}

