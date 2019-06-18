package javaoop.concepts.inheritance;


// class chi co the ke thua tu 1 class va co the implement nhieu interface
public class Employee extends Person implements Company, ABC{
	
	private String address;

	public Employee(String address, boolean gender) {
		super();
		this.address = address;
		this.gender = gender;
	}

	public Employee() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// class con co the override la method cua class cha
	@Override
	public void sayHello() {
		System.out.println("employee say hello");
	}

}
