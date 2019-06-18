package javaoop.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
//chi co the luu duoc dang enum
public class EnumSetDemo {

	public static void main(String[] args) {
		Set<Demo> set = EnumSet.of(Demo.ONE, Demo.TWO, Demo.THREE);
		
		Iterator<Demo> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
