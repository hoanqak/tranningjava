package javaoop.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// su dung arraylist khi chi muon lay du lieu
public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// add
		list.add("a");
		list.add("b");
		list.add("c");

		// truy xuat phan tu theo index
		System.out.println(list.get(1));

		// hoac co the duyen 1 cach de dang
		for (String s : list) {
			System.out.println(s);
		}
		// delete
		list.remove(0);
		list.remove("b");
		System.out.println("sau khi xoa ");
		for (String s : list) {
			System.out.println(s);
		}

		// them vao vi tri
		list.add(0, "d");
		System.out.println("sau khi them vao vi tri 0");
		for (String s : list) {
			System.out.println(s);
		}

		//duyet theo iterator
		System.out.println("duyet theo iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
