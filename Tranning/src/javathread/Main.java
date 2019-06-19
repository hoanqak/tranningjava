package javathread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Caculator caculator = new Caculator(10, 21);
		Future<String> future2 = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Hello " + " World";
			}
		});
		Future<Integer> future = executorService.submit(caculator);
		Future<Integer> future3 = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					System.out.println("Thread running !!!");
				}

				return 0;
			}
		});
		System.out.println(future.get());
		System.out.println(future2.get());
		System.out.println(future3.get(5, TimeUnit.SECONDS));

		executorService.shutdown();
	}

}
