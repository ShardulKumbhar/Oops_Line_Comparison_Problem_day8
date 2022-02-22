package geometry;

import java.util.Scanner;

class geometry {
	void length() {
		Scanner scanner = new Scanner(System.in);

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

		System.out.println("Length of line = " + result);

		scanner.close();
	}
}

public class GeometryForLength {

	public static void main(String[] args) {
		geometry r = new geometry();
		r.length();
	}
}
