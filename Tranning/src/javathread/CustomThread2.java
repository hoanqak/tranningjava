package javathread;

public class CustomThread2 extends Thread {

	public void run() {

		for (int i = 0; i < 30; i++) {
			System.out.println("Thread 2: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	};
}
