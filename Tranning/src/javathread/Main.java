package javathread;

public class Main {

	public static void main(String[] args) {
		CustomThread1 customThread1 = new CustomThread1();
		CustomThread2 customThread2 = new CustomThread2();
		// 2 luong chay doc lap
		customThread1.start();
		customThread2.start();
		
	}

}
