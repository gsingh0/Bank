# Bank
Simulates a simple bank operation using Queues and Timer/TimerTask implementation

Purpose: To gain experience with with Queues.
		   To gain experience with library functions that generates random numbers and provide time.
		   To use arrays.

Solution & Algorithm: This program runs by the usage of the Timer and TimerTask classes. There are 5 tellers, each instantiated into a bankTeller
						object inside of an array. Each teller has availability (boolean) and customer (customer object) data fields. Each teller has 
						its own Timer object and TimerTask object that dequeues a customer from the queue. To prevent any exceptions, I set a precedence
						for each teller where teller 1 has the highest precedence while teller 5 has the lowest precedence. What this means is that when
						more than one teller is available to poll a single customer in the queue, the teller with the highest precedence polls that customer.
						It is important to note that the queue of customers adds new customers to the list at random times between 2 to 6 seconds. The program
						runs for 2 minutes with the implementation of the programClock data field in the bank class. I set a Timer object with a TimerTask
						extended class that subtracts 1 from the programClock (initially set equal to 120) every second. That way the program runs the 
						required time. 
Data Structures Used: Queues and ArrayLists

Description of IO: The program does not require any user input other than repeating the entire process again. The output will show the counter which 
					 counts down from 2 minutes. The output depicts the amount of customers in the queue and when they are dequeued by a bank teller
					 Once the counter hits zero, the output shows the amount of customers each teller helped, the amount of time each teller spent with 
					 the customers, the total amount of customers that visited the bank, and the amount of customers that did not get to meet a teller 
					 (still in the queue).

Purpose of each Class: bank class runs the entire program where it instantiates any necessary objects such as customer, bankTeller, and Timer/TimerTask
						 objects. The customerTellerTask class handles the functionalities of each teller object. For example, customerTellerTask0 dequeues
						 a customer from the queue when the queue is not empty and corresponds that customer to teller 1. The customer class describes the 
						 methods and behaviors of a customer object. The bankTeller class describes the methods and behaviors of the teller objects. The 
						 programClock class runs the countdown of the programclock field.
