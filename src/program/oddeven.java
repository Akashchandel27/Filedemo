package program;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// check odd or even number
		
		int number;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you have to enter");
		number=in.nextInt();
		System.out.println("the number you have entered is" +number);
		
		if (number % 2 == 0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
		
		in.close();
		

	}

}
