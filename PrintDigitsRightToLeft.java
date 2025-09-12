/*
Q18. Print Digits Right to Left (Easy)
Print digits of a given number from right to left.
Input format :
An integer.
Output format :
Digits separated by space.
Sample test cases :
Input :
1234
Output :
4 3 2 1 
*/
package week1;
import java.util.Scanner;
public class PrintDigitsRightToLeft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int digit;
		while(n>0) {
			digit = n %10;
			System.out.print(digit + " ");
			n /=10;
		}
		sc.close();
	}
}