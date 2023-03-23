import java.io.*;
import java.util.*;

public class Leap_Year_or_Not {
  public static String isleep(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		  return "Yes";
		}
    return "No";
	}

	public static void main(String args[]) throws IOException {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			System.out.println(isleep(sc.nextInt()));
			t--;
		}

	}
}
