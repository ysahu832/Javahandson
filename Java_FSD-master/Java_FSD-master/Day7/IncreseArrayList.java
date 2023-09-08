package Day7;

import java.util.ArrayList;

public class IncreseArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>(3);

        c1.add("Rohit");

        c1.add("Amit");

        c1.add("Raj");

        System.out.println("Original array list: " + c1);

        //Increase capacity to 6

        c1.ensureCapacity(6);

        c1.add("Manish");

        c1.add("Rakesh");

        c1.add("Yogesh");

        System.out.println("New array list: " + c1);

	}

}
