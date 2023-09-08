package Day7;

import java.util.ArrayList;

public class TrimArrayList {

	public static void main(String[] args) {
		ArrayList<String> m1= new ArrayList<String>();
        m1.add("Cat");
        m1.add("Dog");
        m1.add("Lion");
        m1.add("Tiger");
        m1.add("Snake");
        System.out.println("Original array list: " + m1);
        System.out.println("Let trim to size the above array: ");
        m1.trimToSize();
        System.out.println(m1);

	}

}
