package Day1;

import java.util.Scanner;

public class Read_Floating_Point_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter A Floating Number");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		if (n > 0)
        {
            if (n < 1)
            {
                System.out.println("Positive small");
            }
            else if (n > 1000000)
            {
                System.out.println("Positive large");
            }
            else
            {
                System.out.println("Positive");
            }
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
            {
                System.out.println("Negative small");
            }
            else if (Math.abs(n) > 1000000)
            {
                System.out.println("Negative large");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Zero");
        }

	}

}
