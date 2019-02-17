package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		RunnableDemo r =  new RunnableDemo();
		es.submit(r);
		es.submit(r);
		es.shutdown();
	}
}
