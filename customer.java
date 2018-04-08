package bank;

public class customer {
	
	private int timeSpent;
	private String name;
	
	//pre: none due to no parameters
	//post: randomizes the timeSpent parameter and sets name to new Customer
	public customer() {
		int min = 2;
		min = min + (int)(Math.random() * 4);
		this.timeSpent = min * 1000 ;
		name = "New Customer";
	}
	//pre: none due to no parameters
	//post: returns timeSpent
	public int getTimeSpent() {
		return timeSpent;
	}
	//pre: none due to no parameters
	//post: sets timeSpent to 5000 or 5 seconds
	public void setTimeSpent() {
		timeSpent = 5000;
	}
	//pre: none due to no parameters
	//post: returns name data field
	public String toString() {
		return name;
	}

}
