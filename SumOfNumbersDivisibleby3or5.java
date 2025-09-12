/*
Q19. Sum of Numbers Divisible by 3 or 5 (Medium)
Accept an integer range and print the sum of numbers that are divisible by either 3 or 5.
Input format :
Two integers (start and end).
Output format :
Sum of numbers.
Sample test cases :
Input :
1 10
Output :
33
*/
package week1;
import java.util.Scanner;
public class SumOfNumbersDivisibleby3or5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, s =sc.nextInt(), e =sc.nextInt();
		for(int i=s; i<=e; i++) if(i % 3==0 || i%5 ==0) sum +=i;
		System.out.println(sum);
		sc.close();
	}
}