package javaoop.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// hashmap khong duy tri thu tu them vao
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "hello");
		map.put(2, "world");
		map.put(null, "123");

		// duyet map
		// lay toan bo key
		Set<Integer> key = map.keySet();
		Iterator<Integer> itr = key.iterator();
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		// key khong duoc trung nen no se thay the value moi  vao key da co
		map.put(null, "viet nam");
		itr = key.iterator();
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		//remove theo key
		map.remove(null);

		map.values(); // lay toan bo value
		for(String value: map.values()) {
			System.out.println(value);
		}
		
		//kiem tra xem co value nay chua
		if(map.containsValue("hello")) {
			System.out.println("value ton tai");
		}
		//kiem tra key
		if(map.containsKey(null)) {
			System.out.println("key ton tai");
		}
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
	}

}
