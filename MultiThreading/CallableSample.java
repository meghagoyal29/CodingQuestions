package MultiThreading;

import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class CallableSample implements Callable<Integer>{
	
	int threadValue = 0;
	String name = "default";
	
	public CallableSample(int value, String name) {
		this.threadValue = value;
		this.name = name;
	}

	@Override
	public Integer call() throws Exception {
		Stream.of(1, 2, 3, 4, 5).map(number -> name+ "  " + number).forEach(System.out::println);
		return threadValue;
	}
}
