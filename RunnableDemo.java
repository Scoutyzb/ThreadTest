package day26;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=100; i++) {
			System.out.println("runnable..."+i);
		}
	}

}
