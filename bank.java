package bank;

import java.util.*;

public class bank  {
	
	public static Queue<customer> customerQueue = new LinkedList<customer>();
	public static int programclock = 120;
	public static boolean programStatus = true;
	public static bankTeller[] teller = {new bankTeller(false, new customer()),new bankTeller(false, new customer()),new bankTeller(false, new customer()),
			new bankTeller(false, new customer()),new bankTeller(false, new customer())};
	
	public static int totalCustomers = 5;
	
	public static int customersHelped0 = 1;
	public static int customersHelped1 = 1;
	public static int customersHelped2 = 1;
	public static int customersHelped3 = 1;
	public static int customersHelped4 = 1;
	
	public static int totalTimeCustomerOccupied0 = 6000;
	public static int totalTimeCustomerOccupied1 = 6000;
	public static int totalTimeCustomerOccupied2 = 6000;
	public static int totalTimeCustomerOccupied3 = 6000;
	public static int totalTimeCustomerOccupied4 = 6000;
	
	public static int totalCustomerNotSeeTeller;
	public static int totalTime = 120;
	
	public static void main (String [] args) throws InterruptedException, IllegalStateException {
		Scanner input = new Scanner(System.in);
		
		Timer program = new Timer();
		Timer customertoQueue = new Timer();
		Timer customerteller = new Timer();
		Timer customerteller1 = new Timer();
		Timer customerteller2 = new Timer();
		Timer customerteller3 = new Timer();
		Timer customerteller4 = new Timer();
		
	
		boolean repeat = false;
		do {
			
			program.schedule(new programClock(), 0, 1000);
			customertoQueue.schedule(new customerQueueTask(), 0, customerQueueTime());
			
			customerteller.schedule(new customerTellerTask(), 6000, teller[0].getCustomer().getTimeSpent());
			customerteller1.schedule(new customerTellerTask1(), 6000, teller[1].getCustomer().getTimeSpent());
			customerteller2.schedule(new customerTellerTask2(), 6000, teller[2].getCustomer().getTimeSpent());
			customerteller3.schedule(new customerTellerTask3(), 6000, teller[3].getCustomer().getTimeSpent());
			customerteller4.schedule(new customerTellerTask4(), 6000, teller[4].getCustomer().getTimeSpent());
			Thread.sleep(125000);
			
			totalCustomerNotSeeTeller = customerQueue.size();
			
			if (programclock == 0) {
				System.out.println("The total amount of customers that visited the bank for that 2 minutes: " + totalCustomers);
				System.out.println("The total amount of customers that  teller 1 helped: " + customersHelped0);
				System.out.println("The total amount of customers that  teller 2 helped: " + customersHelped1);
				System.out.println("The total amount of customers that  teller 3 helped: " + customersHelped2);
				System.out.println("The total amount of customers that  teller 4 helped: " + customersHelped3);
				System.out.println("The total amount of customers that  teller 5 helped: " + customersHelped4);
				
				System.out.println("The total amount of time that teller 1 was occupied: " + totalTimeCustomerOccupied0/1000);
				System.out.println("The total amount of time that teller 2 was occupied: " + totalTimeCustomerOccupied1/1000);
				System.out.println("The total amount of time that teller 3 was occupied: " + totalTimeCustomerOccupied2/1000);
				System.out.println("The total amount of time that teller 4 was occupied: " + totalTimeCustomerOccupied3/1000);
				System.out.println("The total amount of time that teller 5 was occupied: " + totalTimeCustomerOccupied4/1000);
				
				System.out.println();
				
				System.out.println("Total program runtime: " + totalTime + " seconds");
				
				System.out.println();
				
				System.out.println("The total amount of customers that did not get to see a teller: " + totalCustomerNotSeeTeller);
				
				System.out.println();
				
				
				
			}
			
			System.out.println("Would you like to repeat the program? (y/n) ");
			String x = input.nextLine();
			if (x.equals("y")) {
				repeat = true;
				reset();
			}
			else if (x.equals("n")) {
				repeat = false;
				System.exit(0);
			}
			
			
		
			
			
		} while (repeat == true);
	}
	
	//pre: No pre-condition due to no parameters
	//post: Adds customers to the queue every 2-6 seconds
	public static int customerQueueTime() {
		int min = 2000;
		min = min + (int)(Math.random()*4000);
		return min;
	}
	
	//pre: n must be from 0-4 or else it will return true 
	//post: sets the precedence for each teller object
	public static boolean tellerAvailability(int n) {
		boolean teller0;
		boolean teller01;
		boolean teller012;
		boolean teller0123;
		
		if (n == 0) {
			teller0 = teller[0].getAvailability();
			return teller0;
			
		}
		else if (n == 1 && teller[0].getAvailability() == false && teller[1].getAvailability() == false) {
			teller01 = false;
			return teller01;
		}
		else if (n==2 && teller[0].getAvailability() == false && teller[1].getAvailability() == false && teller[2].getAvailability() == false) {
			teller012 = false;
			return teller012;
		}
		else if (n==3 && teller[0].getAvailability() == false && teller[1].getAvailability() == false && teller[2].getAvailability() == false 
							&& teller[3].getAvailability() == false) {
			teller0123 = false;
			return teller0123;
		}
		
		else {
			return true;
		}
	}
	
	//pre: no pre-condition due to no parameters
	//post: resets the data fields that are measured in the program
	
	public static void reset() {
		programclock = 120;
		totalCustomers = 5;
		
		customersHelped0 = 1;
		customersHelped1 = 1;
		customersHelped2 = 1;
		customersHelped3 = 1;
		customersHelped4 = 1;
		
		totalTimeCustomerOccupied0 = 6000;
		totalTimeCustomerOccupied1 = 6000;
		totalTimeCustomerOccupied2 = 6000;
		totalTimeCustomerOccupied3 = 6000;
		totalTimeCustomerOccupied4 = 6000;
		
		totalCustomerNotSeeTeller = 0;
		
		teller[0].setNextCustomer(new customer());
		teller[0].setAvailability(false);
		
		teller[1].setNextCustomer(new customer());
		teller[1].setAvailability(false);
		
		teller[2].setNextCustomer(new customer());
		teller[2].setAvailability(false);
		
		teller[3].setNextCustomer(new customer());
		teller[3].setAvailability(false);
		
		teller[4].setNextCustomer(new customer());
		teller[4].setAvailability(false);
		
		customerQueue.clear();
		
	}
	
	

	
}




