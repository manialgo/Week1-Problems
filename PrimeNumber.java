/*
Q24. Prime Number (Easy)
Check whether a number is Prime.
Input format :
An integer.
Output format :
Prime / Not Prime.
Sample test cases :
Input :
7
Output :
Prime
Input :
10
Output :
Not Prime
*/
package week1;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean val = true;
		for(int i=2; i< Math.sqrt(n); i++) {
			if(n % i == 0) {
				val = false;
				break;
			}
			else val = true;
		}
		if(val) System.out.println("Prime");
		else System.out.println("Not Prime");
		sc.close();
	}
}