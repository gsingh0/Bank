package bank;

public class bankTeller {
	
	private boolean isAvailable;
	private customer currentCustomer;
	
	//pre: none due to no parameters
	//post: sets data fields equal to the parameters
	public bankTeller(boolean isAvailable, customer currentCustomer) {
		this.isAvailable = isAvailable;
		this.currentCustomer = currentCustomer;
	}
	
	//pre: none due to no parameters
	//post: returns availability status
	public boolean getAvailability() {
		return isAvailable;
	}
	
	//pre: none due to no parameters
	//post: sets availability status
	public void setAvailability(boolean b) {
		isAvailable = b;
	}
	
	//pre: none due to no parameters
	//post: returns customer object
	public customer getCustomer() {
		return currentCustomer;
	}
	
	//pre: none due to no parameters
	//post: sets next customer object
	public void setNextCustomer(customer c) {
		this.currentCustomer = c;
	}

}
