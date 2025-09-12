/*
Q7. Max of 3 Numbers (Easy)
Find the maximum of three numbers.
Input format :
Three integers separated by spaces.
Output format :
The maximum number.
Sample test cases :
Input :
5 7 3
Output :
7
Input :
12 45 23
Output :
45 
*/
package week1;
import java.util.Scanner;
public class MaxAndMinOfThreeNum {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max, min;
		if(a > b && a>c) max =a;
		else if(b>a && b >c) max=b;
		else max = c;
		
		if(a < b && a<c) min =a;
		else if(b<a && b<c) min=b;
		else min = c;
		
		System.out.println(max +" "+ min);
		sc.close();
	}

}
