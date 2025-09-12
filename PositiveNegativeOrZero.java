/*
Q8. Positive, Negative or Zero (Easy)
Write a program that prompts the user to input a number. The program should then output the
number and a message saying whether the number is positive, negative, or zero.
Input format :
The input consists of a number.
Output format :
The output prints whether the number is positive, negative or zero.
Sample test cases :
Input :
5
Output :
5 is positive
Input :
-8
Output :
-8 is negative
Input :
0
Output :
0 is zero
*/
package week1;
import java.util.Scanner;
public class PositiveNegativeOrZero {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0) System.out.println(n + " is positive");
		else if(n<0) System.out.println(n + " is negative");
		else System.out.println(n + " is zero");
		sc.close();
	}
}