/*
Q2. Positive / Negative (Easy)
Write a program to check whether a number is Positive, Negative, or Zero.
Input format :
The input consists of an integer.
Output format :
The output prints whether the number is "Positive", "Negative" or "Zero".
Sample test cases :
Input :
5
Output :
Positive
Input :
-3
Output :
Negative
Input :
0
Output :
Zero 
*/
package week1;
import java.util.Scanner;
public class PosOrNegOrZero {
	public static void PosOrNegOrZero1(int n) {
//	static void PosOrNegOrZero(int n){
		//if(n>0) System.out.println("Positive");
		//else if(n<0) System.out.println("Negative");
		//else System.out.println("Zero");
		System.out.println((n!=0)?(n>0)?"Postive":"Negative":"Zero");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//PosOrNegOrZero obj  = new PosOrNegOrZero();
		//obj.PosOrNegOrZero1(n);
		PosOrNegOrZero.PosOrNegOrZero1(n);
		sc.close();
	}
}