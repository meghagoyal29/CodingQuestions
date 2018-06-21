package MultiThreading;

import java.util.stream.Stream;

public class RunnableSample implements Runnable {
	private Thread runnable;
	private String name;

	public RunnableSample(String name) {
		this.name = name;
	}

	public RunnableSample(Thread runnable, String name) {
		this.runnable = runnable;
		this.name = name;
	}

	@Override
	public void run() {
		if (runnable != null) {
			try {
				runnable.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Stream.of(1, 2, 3, 4, 5).map(number -> name+ "  " + number).forEach(System.out::println);
	}
}
