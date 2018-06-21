package MultiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceMain {
	
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(8);
		Future<Integer> future = es.submit(new CallableSample(3, "future"));
		try {
			System.out.println(future.get());
			Future<Integer> future2 = es.submit(new CallableSample(4,"future2"));
			Future<Integer> future3 = es.submit(new CallableSample(5,"future3"));
			Future<Integer> future4 = es.submit(new CallableSample(6,"future4"));
			Future<Integer> future5 = es.submit(new CallableSample(7,"future5"));
			Future<Integer> future6 = es.submit(new CallableSample(8,"future6"));
			Future<Integer> future7 = es.submit(new CallableSample(9,"future7"));
			Future<Integer> future8 = es.submit(new CallableSample(10,"future8"));
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
			System.out.println(future5.get());
			System.out.println(future6.get());
			System.out.println(future7.get());
			System.out.println(future8.get());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();
	}
}
