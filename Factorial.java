/*
Q17. Factorial (Medium)
Find the factorial of a number.
Input format :
An integer.
Output format :
Factorial value.
Sample test cases :
Input :
5
Output :
120
Input :
-7
Output :
Error! Factorial of a negative number doesn't exist. 
*/
package week1;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact=1, n = sc.nextInt();
		if(n >=0) {
			if(n ==0) System.out.println("1");
			if(n>0) {
				for(int i=n; i>=1; i--) {
					fact *= i;
				}System.out.println(fact);
			}
		}
		else System.out.println("Error! Factorial of a negative number doesn't exist.");
		sc.close();
	}
}