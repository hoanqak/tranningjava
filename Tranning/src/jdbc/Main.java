package jdbc;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("michael", 21);
		jdbcConnection connection = new jdbcConnection();
		// insert 1 emp vao db
		connection.insert1(employee);
		// get emp by id
		Employee emp = connection.getEmpById(3);
		if (emp != null) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getAge());
		}

		// get all list emp
		List<Employee> list = connection.getAll();
		for (Employee e : list) {
			System.out.println(e.getId() + " : " + e.getName() + " : " + e.getAge());
		}

		// delete emp by id
		System.out.println(connection.delete(3));
		// update emp
		connection.update(new Employee("stark", 50), 2);

		//update use update 2
		connection.update2(new Employee("joinh", 26), 3);
		list = connection.getAll();
		for (Employee e : list) {
			System.out.println(e.getId() + " : " + e.getName() + " : " + e.getAge());
		}
	}

}
