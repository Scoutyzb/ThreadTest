package day26;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo rd = new RunnableDemo();
		new Thread(rd).start();
		for(int i = 1;i<=100; i++) {
			System.out.println("main..."+i);
		}
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("i love u:");
			}
		}.start();


	}

}
