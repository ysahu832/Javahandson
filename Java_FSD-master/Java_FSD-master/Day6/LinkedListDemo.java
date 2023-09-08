package Day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<>();
		ls.add("One");ls.add("Two");ls.add("Three");ls.add("Four");
		ls.add("Five");ls.add(null);ls.add("One");
		ls.add(4,"Eight");
		ls.addLast("Ten");ls.addFirst("Zero");
		System.out.println(" List 1 ="+ls);
		ArrayList<String >al = new ArrayList<>();
		al.add("Twenty");al.add("Twenty-One");al.add("Twenty-three");
		
		ls.addAll(al);
		System.out.println(" List after adding arraylist element - "+ls);
		Vector< String > v = new Vector<>();
		v.add("Monday");v.add("tusday");v.add("Wednesday");
		ls.addAll(v);
		System.out.println(" List after adding vector element - "+ls);
		
		LinkedList <String> list = new LinkedList<String>();
		list.add("INDIA");
		list.add("USA");
		list.add("JAPAN");
		list.add("UK");
		list.add("CANADA");
		System.out.println("INTIAL lINKEDlIST ORDER");
		System.out.println(list);
		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
	}
}