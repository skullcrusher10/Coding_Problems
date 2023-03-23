package prepbytes;

import java.io.IOException;
import java.util.Scanner;

public class Reverse_the_number {
	public static int revv(int a) {
		int rev = 0;
		int rem = 0;
		while (a > 0) {
			rem = a % 10;
			rev = (rev * 10) + rem;
			a = a / 10;
		}
		return rev;
	}

	public static void main(String args[]) throws IOException {

		// write your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(revv(num));

	}
}
