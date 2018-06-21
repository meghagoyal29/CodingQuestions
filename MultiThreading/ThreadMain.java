package MultiThreading;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new RunnableSample("thread1"));
		Thread thread2 = new Thread(new RunnableSample(thread1, "thread2"));
		thread1.start();
		thread2.start();
		System.out.println("main ends here");
	}
	}
