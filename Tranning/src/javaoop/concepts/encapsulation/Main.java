package javaoop.concepts.encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.address = ""; // access modifier protected Co the truy cap  tu class ben ngoai
		employee.age = 10; // access modifier la public pham vi truy cap toan bo project
		employee.salary = 100;// access modyfier  la default, co the truy cap ben trong package
		employee.getName(); // bien name la private nen khong the truy cap truc tiep mà phải truy cap thong qua method get/set
	}
	
}
