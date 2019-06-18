package javaoop.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(0);
		set.add(-2);
		set.add(0);
		//set khong cho phep cac phan tu trung lap
		System.out.println(set.size());
		//set khong the truy cap cac phan tu theo index
		for(int a : set) {
			System.out.println(a);
		}
		
		set.remove(0);
		//set khong the truy cap phan tu theo index ne khong the dung duoc vong lap for
		//iterator
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
