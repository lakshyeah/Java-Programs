package project_2;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		
		System.out.println("Enter product amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		float discount = 0.0f;
		
		if (amount < 0)
			System.out.println("Enter a valid price");
		else if (amount < 10000)
			discount = amount* 0.05f;
		else if (amount < 20000)
			discount = amount* 0.1f;
		else if (amount < 35000)
			discount = amount* 0.15f;
		else
			discount = amount* 0.2f;

		System.out.println("Discount for " + amount + ": " + discount);
	}
}
