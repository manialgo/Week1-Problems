/*
Q23. Perfect Number (Medium)
Check whether a number is a Perfect Number.
(A Perfect Number is equal to the sum of its proper divisors.)
Input format :
An integer.
Output format :
Perfect / Not Perfect.
Sample test cases :
Input :
28
Output :
Perfect Number
Input :
12
Output :
Not Perfect Number 
*/
package week1;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, n =sc.nextInt();
		for(int i=1; i<=n/2; i++) if(n % i ==0) sum +=i;
		if(n==sum) System.out.println("Perfect Number");
		else System.out.println("Not Perfect Number");
		sc.close();
	}
}