/*
Q15. Sum of Even Numbers (Easy)
Find the sum of even numbers between 1 and a given number.
Input format :
An integer.
Output format :
Sum of even numbers.
Sample test cases :
Input :
10
Output :
30
Input :
7
Output :
12 
*/
package week1;
import java.util.Scanner;
public class SumOfEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, n = sc.nextInt();
		for(int i=1; i<=n; i++) if( i %2==0) sum+=i;
		System.out.print(sum);
		sc.close();
	}
}