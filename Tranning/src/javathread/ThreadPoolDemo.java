package javathread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Thread thread = new Thread() {
			public void run() {
				
				while(true) {
					System.out.println("thread 1 running");
				}
				
			};
		};
		Thread thread2 = new Thread() {
			public void run() {
				
				while(true) {
					System.out.println("thread 2 running");
				}
				
			};
		};
		Thread thread3 = new Thread() {
			public void run() {
				
				while(true) {
					System.out.println("thread 3 running");
				}
				
			};
		};
		Thread thread5 = new Thread() {
			public void run() {
				
				while(true) {
					System.out.println("thread 5 running");
				}
				
			};
		};
		Thread thread4 = new Thread() {
			public void run() {
				
				while(true) {
					System.out.println("thread 4 running");
				}
				
			};
		};
		
		executor.submit(thread);
		executor.submit(thread2);
		executor.submit(thread3);
		executor.submit(thread4);
		executor.submit(thread5);
		//chi co 3 thread chay
		executor.shutdown();
	}
	
}
