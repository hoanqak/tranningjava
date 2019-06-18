package javaoop.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	//treeSet duy tri thu tu tang dam
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(12);
		treeSet.add(122);
		treeSet.add(11);
		treeSet.add(3);
		treeSet.add(-23);
		
		Iterator<Integer> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
