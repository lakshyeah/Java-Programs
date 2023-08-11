package project_2;

import java.util.Scanner;

public class BillCalculator {
	public static void main(String[] args) {
		System.out.println("Enter your electricity consumption in units");
		Scanner sc = new Scanner(System.in);
		float units = sc.nextFloat();
		double amt = 0;
		if (units < 0)
			System.out.println("Invalid number of units");
		else if (units <= 200)
		{
			amt = units * 3.80;
		}
		else if (units <= 300)
		{
			amt = 200*3.80 + (units%200) * 4.40;
		}
		else if (units <= 400)
		{
			amt = 200*3.80 + 100*4.40 + (units%300) * 5.10;
		}
		else
		{
			amt = 200*3.80 + 100*4.40 + 100*5.10 + (units%400)*5.80;
		}
		System.out.println("Bill amount: " + amt);
		
}
	
}
