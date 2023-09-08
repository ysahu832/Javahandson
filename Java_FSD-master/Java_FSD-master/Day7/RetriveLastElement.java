package Day7;

import java.util.LinkedList;

public class RetriveLastElement {

	public static void main(String[] args) {
		LinkedList <String> m1 = new LinkedList <String> ();

        m1.add("Manish");

        m1.add("Nagesh");

        m1.add("Rohit");

        m1.add("Rahul");

        m1.add("Amit");

        System.out.println("Original linked list: " + m1);    

        String x = m1.peekLast();

        System.out.println("Last element in the list: " + x);

        System.out.println("Original linked list: " + m1);

	}

}
