package program;

import java.util.Scanner;

public class whilelloop {

	public static void main(String[] args) {
		int min = 1;
		int max = 6;
		int n;
		
		// Generate random double value from 200 to 400
//		System.out.println("Random value of type double between " + min + " to " + max + ":");
//		double a = Math.random() * (max - min + 1) + min;
//		System.out.println(a);
		
		// Generate random int value from 200 to 400
		System.out.println("Random value of type int between " + min + " to " + max + ":");
		int b = (int) (Math.random() * (max - min + 1) + min);
		//System.out.println(b);
		
		Scanner in = new Scanner(System.in);
		
		while ((n = in.nextInt()) >= 6) {
			 System.out.println("You entered " + n);
			 System.out.println("Input an integer \n try again");
			 }
		
		if( n == b) {
			System.out.println("You won the match");
		}
		else {
			System.out.println("you lose");
		}
		
		System.out.println("Random number is " +b +"your number is" +n);
		
		in.close();
	}

}
