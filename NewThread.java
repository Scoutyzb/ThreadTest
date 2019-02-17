package day26;

public class NewThread extends Thread {
	public void run() {
		for(int i = 1;i<=100; i++) {
			System.out.println("thread..."+i);
		}
	};
	public NewThread(String name) {
		super(name);
	}
	public NewThread() {
		super();
		// TODO Auto-generated constructor stub
	}
}
