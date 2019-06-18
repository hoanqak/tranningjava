package javaoop.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//su dung linkedlist khi muon thao tac voi list
public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		List<String> list1 = new LinkedList<String>();
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		// lay theo index
		System.out.println(list.get(3));

		// duyet bang foreach
		for (String s : list) {
			System.out.println(s + "    ");
		}
		System.out.println("\n");
		// duyet theo index su dung for
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "    ");
		}
		System.out.println("\n");

		// su dung iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "    ");
		}
		// xoa phan tu thu 0
		list.remove(0);
		// them 1 phan tu vao vi tri thu 3
		list.add(3, "g");
		System.out.println("\n");

		// them 1 list
		list.addAll(list1);
		for (String s : list) {
			System.out.print(s + "   ");
		}
		
		//xoa toan bo list
		list.clear();
		System.out.println("\n"+list.size());
	}

}
