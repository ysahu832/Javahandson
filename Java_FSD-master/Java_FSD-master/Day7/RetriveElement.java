package Day7;

import java.util.ArrayList;
import java.util.List;

public class RetriveElement {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Manish");
		list_Strings.add("Naresh");
		list_Strings.add("Amit");
		list_Strings.add("Rohit");
		list_Strings.add("Rajesh");
		System.out.println(list_Strings);
		
		String element = list_Strings.get(0);
		System.out.println("First element: "+element);
		element = list_Strings.get(2);
		System.out.println("Third element: "+element);

	}

}
