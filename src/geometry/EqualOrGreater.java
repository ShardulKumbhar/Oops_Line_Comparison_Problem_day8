package geometry;

import java.util.Scanner;

class Geometry2 {

	public static int getLengthOfLine(Scanner scanner)

	{
		// user input
		System.out.println("Please enter x1");
		int x1 = scanner.nextInt();

		System.out.println("Please enter y1");
		int y1 = scanner.nextInt();

		System.out.println("Please enter x2");
		int x2 = scanner.nextInt();

		System.out.println("Please enter y2");
		int y2 = scanner.nextInt();

		int val1 = (int) Math.pow((x2 - x1), 2);
		int val2 = (int) Math.pow((y2 - y1), 2);
		int result = (int) Math.sqrt(val1 + val2);

		return result;
	}

	public void gratersmaller() {
		// userinput
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter values for line 1");
		int lenthOfline_1 = getLengthOfLine(scanner);
		System.out.println("Please enter values for line 2");
		int lenthOfline_2 = getLengthOfLine(scanner);

		int val1 = lenthOfline_1;
		int val2 = lenthOfline_2;

		// to check greter than or less than
		if (val1 == val2) {
			System.out.println("Both lines are equal");
		} else if (val1 < val2) {
			System.out.println("line 2 is greater");
		} else {
			System.out.println("line 1 is greater");
		}

		scanner.close();
	}

}

public class EqualOrGreater {

	public static void main(String[] args) {
		// creating an object
		Geometry2 x = new Geometry2();
		// calling methord
		x.gratersmaller();

	}

}
