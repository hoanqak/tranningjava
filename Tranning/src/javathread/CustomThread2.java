package javathread;

public class CustomThread2 extends Thread {

	private Mid mid;
	
	
	public CustomThread2(Mid mid) {
		super();
		this.mid = mid;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread - 2: " + mid.getNumber());
			mid.setNumber(10);
		}

	};
}
