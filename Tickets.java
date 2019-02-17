package day27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tickets {
	public static void main(String[] args) {
		TicketsRunnable tr = new TicketsRunnable();
		  Thread t0 = new Thread(tr,"P1");
	        Thread t1 = new Thread(tr,"P2");
	        Thread t2 = new Thread(tr,"P3");
	        
	        t0.start();
	        t1.start();
	        t2.start();
	}
}
