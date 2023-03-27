import java.util.*;
import java.io.*;

public class Main {
  static void  even(long a) {
		a=(long) Math.sqrt(a);
		System.out.print(a+" ");
		if(a>1) 
		isevenodd(a);
		if(a == 1)
		System.out.println();
		}
	
	static void  odd(long a) {
		a =(long) (Math.sqrt(a)*Math.sqrt(a)*Math.sqrt(a));
		System.out.print(a+" ");
		if(a>1) 
		isevenodd(a);
		if(a == 1)
		System.out.println();

		}
	
	static void isevenodd(long n) {
		if (n % 2 == 0) {
			even(n);
		} 
		else {
			odd(n);
		}
	}
	
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			long n = sc.nextLong();
			System.out.print(n+" ");
			if(n != 1)
			isevenodd(n);
			
		}
  }
}
