package day27;

public class TicketsRunnable implements Runnable {
	int tickets=100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tickets>0) {
			 System.out.println(Thread.currentThread().getName()+" ³öÊÛµÚ "+tickets--);
		}
	}

}
