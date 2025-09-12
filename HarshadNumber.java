/*
Q22. Harshad Number (Medium)
Check whether the given number is a Harshad Number.
(A Harshad Number is divisible by the sum of its digits.)
Input format :
An integer.
Output format :
Harshad / Not Harshad.
Sample test cases :
Input :
18
Output :
Harshad Number
Input :
21
Output :
Not Harshad Number 
*/
package week1;
import java.util.Scanner;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), sum=0, digit, temp = n;
		while(n>0) {
			digit = n %10;
			sum += digit;
			n /= 10;
		}
		if(temp % sum ==0) System.out.println("Harshad Number");
		else System.out.println("Not Harshad Number");
		sc.close();
	}
}