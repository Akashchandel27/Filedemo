package program;

import java.util.Scanner;

public class onetoten {

	public static void main(String[] args) {
		
		int pass_marks=40,obtn_marks;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Obtn marks");
		obtn_marks=in.nextInt();
		
		
		if (pass_marks <= obtn_marks) {
			System.out.println("Java programmer");
		} 
		else {
			System.out.println("What are you doing here?");

		}
		in.close();

	}
}
