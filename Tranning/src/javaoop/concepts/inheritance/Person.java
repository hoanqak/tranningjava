package javaoop.concepts.inheritance;

public class Person {

	private String name;
	private int age;
	protected boolean gender;

	public Person() {
		super();
	}

	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public void sayHello() {
		System.out.println("Person say hello");
	}

}
