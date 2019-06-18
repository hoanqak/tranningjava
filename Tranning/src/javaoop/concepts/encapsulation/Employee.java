package javaoop.concepts.encapsulation;

public class Employee {

	private String name;
	public int age;
	protected String address;
	int salary;

	public Employee(String name, int age, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
