package program;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		int i, m = 0, flag = 0;
		int n = 4;// it is the number to be checked
//		m = n / 2;  ///2 
//		System.out.println(m);
		if (n == 0 || n==1|| n==2 || n%2!=0) {   // 0 or 1
			System.out.println(" prime number");
		} else {
					System.out.println(" is not prime number");
		}
	}

}
