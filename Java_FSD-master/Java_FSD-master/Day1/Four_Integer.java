package Day1;

import java.util.Scanner;

public class Four_Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int x1 = sc.nextInt();
		System.out.println("Enter A Number");
		int x2 = sc.nextInt();
		System.out.println("Enter A Number");
		int x3 = sc.nextInt();
		System.out.println("Enter A Number");
		int x4 = sc.nextInt();
		
		if (x1 == x2 && x2 == x3 && x3 == x4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
