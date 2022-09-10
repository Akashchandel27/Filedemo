package program;

public class loop {

	public static void main(String[] args) {

//		int c;
//		for (c = 1; c <= 10; c++) {
//			System.out.println(c);'
		
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
