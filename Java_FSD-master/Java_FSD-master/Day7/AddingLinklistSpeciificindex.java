package Day7;

import java.util.LinkedList;

public class AddingLinklistSpeciificindex {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinkedList <String> name1 = new LinkedList <String>();

		name1.add("Rohit");

		name1.add("Subashish");

		name1.add("Mohit");

		name1.add("Amit");

		name1.add("Rohan");

 

		LinkedList <String> name2 = new LinkedList <String>();

		name2.add("Sidhart");

		name2.add("Raj");

		name2.add("Manish");

 

		System.out.println(" Names : " + name1);

		name1.addAll(3, name2);

		System.out.println("Names : " + name1);

	}

}