package javathread;

public class CustomThread1 extends Thread {

	private Mid mid;

	public CustomThread1(Mid mid) {
		super();
		this.mid = mid;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread - 1: " + mid.getNumber());
			mid.setNumber(5);
		}
	}

}
