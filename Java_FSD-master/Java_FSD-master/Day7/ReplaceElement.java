package Day7;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();


		name.add("Rohit");
		name.add("Manish");
		name.add("Mahesh");
		name.add("Amit");


		System.out.println("Original array list: " + name);
		String new_name = "Yogesh";
		name.set(1,new_name);


		int num=name.size();
		System.out.println("Replace second element with 'Yogesh'.");
		for(int i=0;i<num;i++)
		System.out.println(name.get(i));

	}

}
