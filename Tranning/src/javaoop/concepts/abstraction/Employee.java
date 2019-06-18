package javaoop.concepts.abstraction;

// class employee implement Person thi se phai trien khai cac method cua interface Person
public class Employee extends Company implements Person {

	// dinh nghia 2 method cua interfce person
	public void sayHello() {
		System.out.println("Hello");
	}
	public void sayGoodbye() {
		System.out.println("Goodbye");
	}

	// dinh nghia la method cua abstrac t class
	public int sum(int a, int b) {
		return a + b;
	}

}
