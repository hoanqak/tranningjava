package javaoop.concepts.polymorphism;

public class Employee extends Person{

	@Override
	public void sayHello() {
		System.out.println("Employee hello");
	}
	
	//1 hanh dong duoc thuc hien bang nhieu cac khac nhau
	public int  sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
}
