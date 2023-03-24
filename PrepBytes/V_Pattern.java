import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
		int n = 5;
		char c=sc.next().charAt(0);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			for (int k = i + 1; k <= n; k++) {
				System.out.print("    ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);

			}
			System.out.println();

		}
  }
}
