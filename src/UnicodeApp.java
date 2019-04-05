import java.util.Scanner;

public class UnicodeApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter first word: ");
		String s1 = scnr.nextLine();
		System.out.println("Enter second word: ");
		String s2 = scnr.nextLine();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < s1.length(); i++) {
			sum1 = sum1 + s1.charAt(i);
			System.out.println(s1.charAt(i) + ":" + s1.charAt(i));
		}

		for (int j = 0; j < s2.length(); j++) {
			sum2 = sum2 + s2.charAt(j);
			System.out.println(s2.charAt(j) + ":" + s2.charAt(j));
		}

		int diff = Math.abs((sum1 - sum2));

		System.out.println("Difference of unicode values: " + diff);

		scnr.close();

	}

}
