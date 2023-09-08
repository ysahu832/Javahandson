package Day1;

import java.util.Scanner;

public class Different {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Secound Number");
		int b = sc.nextInt();
		
		System.out.println("Sum Of Two Number "+(a+b));
		System.out.println("Subtraction Of Two Number "+(a-b));
		System.out.println("Product Of Two Number "+(a*b));
		System.out.println("Avreage Of Two Number "+((a+b)/2));
		System.out.println("Distance Of Two Number "+(a-b));
		if (a>b) {
			System.out.println("Maximun Of Two Number "+a);
		}
		else {
			System.out.println("Maximun Of Two Number "+b);
		}
		if (a<b) {
			System.out.println("Minimum Of Two Number "+a);
		}
		else {
			System.out.println("Minimum Of Two Number "+b);
		}
	}

}
