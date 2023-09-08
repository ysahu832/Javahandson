package Day7;

import java.util.LinkedList;

public class ElementExitsLinkedlist {

	public static void main(String[] args) {
		LinkedList <String> m1 = new LinkedList <String> ();

        m1.add("Rohit");

        m1.add("Manish");

        m1.add("Rakesh");

        m1.add("Rohan");

        m1.add("Ali");

        System.out.println("Original linked list: " + m1);

       

        if (m1.contains("Rohit")) {

        	System.out.println("Nagesh is present in the linked list.");

        } else {

        	System.out.println("Nagesh is not present in the linked list.");

        }



        if (m1.contains("Rajesh")) {

        	System.out.println("Rajesh is present in the linked list.");

        } else {

        	System.out.println("Rajesh is not present in the linked list.");

        }

	}

}
