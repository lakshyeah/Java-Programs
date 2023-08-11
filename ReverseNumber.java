package project_2;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 456;
		int rev = 0;
		
		int huns = num / 100;
		num = num%100;
		
		int tens = num / 10;
		num = num % 10;
		
		int unit = num;
		
		rev = unit*100 + tens*10 + huns;
		System.out.println(rev);
		
	}
}
