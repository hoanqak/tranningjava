package javathread;

import java.util.concurrent.Callable;

public class Caculator implements Callable<Integer> {

	private int a;
	private int b;

	public Caculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int say() {
		System.out.println(a + " + " + b + " = " + (a + b));
			return a + b;
	}

	@Override
	public Integer call() throws Exception {
		 return this.say();
	}

}
