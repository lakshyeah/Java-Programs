package project_2;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		
		if (marks < 0 || marks > 100)
			System.out.println("Marks Invalid");
		else if (marks <=  49)
			System.out.println("D grade");
		else if (marks <=  69)
			System.out.println("C grade");
		else if (marks <=  89)
			System.out.println("B grade");
		else
			System.out.println("A grade");
			
		
	}
}
