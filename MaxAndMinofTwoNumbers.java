/*
Q6. Max & Min of 2 Numbers (Easy)
Find the maximum and minimum of two numbers.
Input format :
Two integers separated by a space.
Output format :
Maximum and minimum value.
Sample test cases :
Input :
5 9
Output :
Max=9 Min=5
Input :
12 7
Output :
Max=12 Min=7
*/
package week1;
import java.util.Scanner;
public class MaxAndMinofTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		int max = (n1>n2)? n1:n2, min = (n1<n2) ? n1 : n2;
		System.out.print("Max="+max+" Min="+min);
		sc.close();
	}
}