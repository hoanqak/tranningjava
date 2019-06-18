package javaoop.concepts.inheritance;

public class Main {

	public static void main(String[] args) {

		// class employee ke thua class person nen co cac phuong thuc va thuoc tinh cua
		// class person
		// nhung class person dat 2 bien name va age la private nen class employee khong
		// the ke thua 2 thuoc tinh nay
		// va chi ke thua duoc gender, va cac methd cua class person

		Employee employee = new Employee();
		Person person = new Person();
		employee.getAge();
		employee.getName();
		employee.getAddress();
		employee.getGender();
		employee.sayHello();
		person.sayHello();
	}

}
