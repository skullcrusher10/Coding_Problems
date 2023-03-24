import java.util.*;
import java.io.*;

public class Main {
public static int findbox(int t, int c) {
		return c - t;
	}

	public static void main(String args[]) throws IOException {

		// write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int t = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			c = sc.nextInt();
			if (findbox(t, c) >= 2)
				count++;
		}
		// count=(findbox(n, numtoy, capacity));
		System.out.print(count);

	}
}
