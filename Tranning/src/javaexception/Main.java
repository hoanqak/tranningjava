package javaexception;

import java.io.IOException;

import javaoop.concepts.inheritance.Employee;

public class Main {

	// su dung throw method se ban ra 1 exception
	public void ThrowDemo() {
		throw new ArithmeticException();
	}

	// su dung throws khi cac method su dung no se phai handling exception or throws
	// tiep
	public void ThrowsDemo() throws IOException{
		
	}

	public static void main(String[] args) throws IOException {

		
		//Exception giup cho luong cua chuong trinh chay van hoat dong khi xuy ra loi
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				try {
				System.out.println(i / 0);
				}catch(ArithmeticException e) {
					System.out.println(e);
				}
			}
		}
		
		
		int a = 10;
		// su dung khoi lenh try catch de bat loi / 0
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			// khoi finally luon duoc chay
			System.out.println("Done ");
		}

		try {
			String s = "1a";
			int number = Integer.parseInt(s);
			System.out.println(number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Employee employee = null;

		// loi nay xay ra khi runtime
		try {
			System.out.println(employee.getName());
		} catch (NullPointerException e) {
			System.out.println("Error NullPointerException");
		}

		// co the xu dung nhieu catch trong 1 try/catch block

		try {

		} catch (NullPointerException e) {

		} catch (ArithmeticException e) {

		} catch (Exception e) {

		}
		//  Throws
		// method nao su dung no se phai hanlding exception or throws
			new Main().ThrowsDemo();
		// throw
			new Main().ThrowDemo();
	}

}
