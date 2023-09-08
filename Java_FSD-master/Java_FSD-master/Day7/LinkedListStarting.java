package Day7;

import java.util.LinkedList;

public class LinkedListStarting {

	public static void main(String[] args) {
		LinkedList <String> m1 = new LinkedList <String> ();

        m1.add("Yellow");

        m1.add("White");

        m1.add("red");

        m1.add("Grey");

        m1.add("Pink");

        System.out.println("Original linked list: " + m1);    

        String x = m1.peekLast();

        System.out.println("Last element in the list: " + x);

        System.out.println("Original linked list: " + m1);

	}

}
