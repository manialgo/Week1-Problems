/*
Q14. Even Numbers in Range (Easy)
Display even numbers between a given range inclusive of both start and end.
Input format :
Two integers (start and end).
Output format :
Even numbers.
Sample test cases :
Input :
1 10
Output :
2 4 6 8 10 
*/
package week1;
import java.util.Scanner;
public class EvenNumbersInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), e = sc.nextInt();
		for(int i=s; i<=e; i++) {
			if(i % 2==0) System.out.print(i+ " ");
		}
		sc.close();
	}
}