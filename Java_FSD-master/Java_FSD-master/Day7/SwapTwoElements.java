package Day7;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Manish");
        c1.add("Namdev");
        c1.add("Rohit");
        c1.add("Rajesh");
        c1.add("Amit");

        System.out.println("Array list before Swap:");
        for(String a: c1){
        System.out.println(a);
      }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
       Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: c1){
        System.out.println(b);
       }

	}

}
