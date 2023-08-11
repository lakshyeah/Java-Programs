package project_2;

import java.util.Scanner;

public class Discount2 {
	public static void main(String[] args) {
	
		System.out.println("Enter product amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		float discount = 0.0f;
		
		if (amount < 0)
			System.out.println("Enter a valid price");
		else if (amount <= 1000)
			discount = amount* 0.02f;
		else if (amount > 1000 && amount <= 3000)
			discount = amount* 0.1f;
		else if (amount > 3000)
			discount = amount* 0.15f;

		System.out.println("Discount for " + amount + ": " + discount);

		
		
	}
}
