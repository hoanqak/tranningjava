package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class jdbcConnection {

	// khoi tao connection
	public Connection getConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public boolean insert(Employee employee) {
		try {
			Statement statement = getConnect().createStatement();
			String sql = "insert into emp(name, age) values('" + employee.getName() + "'," + employee.getAge() + ")";
			statement.execute(sql);

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;

	}

	public boolean delete(int id) {

		try {
			Statement statement = getConnect().createStatement();
			String sql = "delete from emp as e where e.id =" + id;
			statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean update(Employee employee, int id) {
		try {
			Statement statement = getConnect().createStatement();
			String sql = "update emp set name='" + employee.getName() + "', age = " + employee.getAge() + " where id = "
					+ id;
			statement.executeUpdate(sql);

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	// use Statement
	public List<Employee> getAll() {
		List<Employee> listEmp = new ArrayList<Employee>();
		try {
			Statement statement = getConnect().createStatement();
			String sql = "select * from emp";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
				listEmp.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listEmp;
	}

	// get emp by id use PreparedStatement
	public Employee getEmpById(int id) {
		Employee employee = null;
		try {
			PreparedStatement preparedStatement = getConnect().prepareStatement("select * from emp where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setAge(resultSet.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return null;
			// TODO Auto-generated catch block
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employee;
	}

	// insert use PreparedStatement
	public boolean insert1(Employee employee) {
		String sql = "insert into emp(name, age) values(?, ?)";
		try {
			PreparedStatement preparedStatement = getConnect().prepareStatement(sql);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setInt(2, employee.getAge());

			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return false;
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//use PreparedStatement
	public boolean update2(Employee employee, int id) {
		String sql = "update emp set name = ?, age = ? where id=?";
		try {
			PreparedStatement preparedStatement = getConnect().prepareStatement(sql);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setInt(2, employee.getAge());
			preparedStatement.setInt(3, id);
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return false;
		} finally {
			try {
				getConnect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
