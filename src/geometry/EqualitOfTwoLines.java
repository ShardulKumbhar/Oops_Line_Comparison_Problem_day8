package geometry;

import java.util.Scanner;

class Line {

	public static int getLengthOfLine(Scanner scanner) {

		// user input from scanner
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

	public void computelength() {

		// user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter values for line 1");
		int lenthOfline_1 = getLengthOfLine(scanner);
		System.out.println("Please enter values for line 2");
		int lenthOfline_2 = getLengthOfLine(scanner);

		String val1 = String.valueOf(lenthOfline_1);
		String val2 = String.valueOf(lenthOfline_2);

		// equation to check line is equal or not
		if (val1.equals(val2)) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
		scanner.close();

	}

}

public class EqualitOfTwoLines {

	public static void main(String[] args) {
		// creating an object
		Line l = new Line();
		// calling methord
		l.computelength();

	}
}
