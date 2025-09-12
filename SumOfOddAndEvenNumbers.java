/*
Q16. Sum of Odd and Even Numbers (Medium)
Find the sum of odd and even numbers from 1 to N.
Input format :
An integer.
Output format :
Sum of odd numbers and sum of even numbers separated by a space.
Sample test cases :
Input :
10
Output :
25 30
Input :
15
Output :
64 56
*/
package week1;
import java.util.Scanner;
public class SumOfOddAndEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddSum=0, evenSum=0, n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2 ==0) evenSum += i;
			else oddSum +=i;
		}
		System.out.println(oddSum + " " + evenSum);
		sc.close();
		
	}
}