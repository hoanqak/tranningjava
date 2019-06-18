package javaoop.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(0);
		queue.add(9);
		queue.add(6);
		queue.add(2);
		queue.add(3);
		queue.add(2);
		/* 
		 * queue.add(null);
		 * khong cho phep phan tu null
		 *  */
		//lay ra phan tu dung dau trong queue
		System.out.println(queue.element());
		System.out.println(queue.peek());
		//cac khac de them 1 pha tu, dung cach nay se tra ve gia tri cu the
		// dung add() se nem ra 1 exception
		queue.offer(10);
		//lay phan tu dau sau do xoa no
		System.out.println(queue.poll());
		System.out.println("----------------");
		for(int i : queue) {
			System.out.println(i);
		}
	}
	
}
