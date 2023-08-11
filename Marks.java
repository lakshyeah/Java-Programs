package project_2;

import java.util.Scanner;

public class Marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your grade");
	char grade = sc.next().charAt(0);
	
	if (grade == 'A' || grade == 'a')
		System.out.println("Your marks is between 90 and 100");
	else if (grade == 'B' || grade == 'b')
		System.out.println("Your marks is between 70 and 89");
	else if (grade == 'C' || grade == 'c')
		System.out.println("Your marks is between 50 and 69");
	else if (grade == 'D' || grade == 'd')
		System.out.println("Your marks is between 0 and 50");
	else
		System.out.println("Please enter valid grade");
	
}
}
