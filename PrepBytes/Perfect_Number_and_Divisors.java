import java.util.*;
import java.io.*;

public class Main {
  static void perfect(int p) {
		int check = 0;
		for (int i = 1; i <= p / 2; i++) {
			if (p % i == 0) {
				check = check + i;
			}
		}
		if (check == p) {
			System.out.println("true");
		} else
			System.out.println("false");
	}
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		for (int i = 1; i <= n; i++) {
			p = sc.nextInt();
			perfect(p);
		}

    
  }
}
