package Day7;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();  
	       l.add("Apple");  
	       l.add("Apple");  
	       l.add("Mango");  
	       l.add("Apple");  
	       System.out.println(l.toString());  
	       Set<String> s = new LinkedHashSet<String>(l);  
	       System.out.println(s);  

	}

}
