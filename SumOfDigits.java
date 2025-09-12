/*
Q21. Sum of Digits (Easy)
Find the sum of digits of a number.
Input format :
An integer.
Output format :
Sum of digits.
Sample test cases :
Input :
123
Output :
6
Input :
405
Output :
9 
*/
package week1;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit, sum=0, n=sc.nextInt();
		while(n>0) {
			digit = n %10;
			sum += digit;
			n /=10;
		}
		System.out.println(sum);
		sc.close();
	}
}