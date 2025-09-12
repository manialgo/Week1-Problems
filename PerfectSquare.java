/*
Q25. Perfect Square (Easy)
Check whether a number is a Perfect Square.
Input format :
An integer.
Output format :
Perfect Square / Not Perfect Square.
Sample test cases :
Input :
25
Output :
Perfect Square
Input :
20
Output :
Not Perfect Square 
*/
package week1;
import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean val =false;
		for(int i=1; i<=n/2; i++) {
			if(i*i == n) {
				val = true;
				break;
			} else val = false;
		}
		if(val) System.out.println("Perfect Square");
		else System.out.println("Not Perfect Square");
		sc.close();
	}
}