/*
Q26. Fibonacci Series (Easy)
Print Fibonacci Series up to N terms.
Input format :
An integer N.
Output format :
First N terms of Fibonacci series.
Sample test cases :
Input :
5
Output :
0 1 1 2 3
*/
package week1;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre1=1, pre2=0, curr, n = sc.nextInt();
		int arr[] = new int[n];
		if(n==1) {
			arr[0]=0;
		}
		else if(n==2) {
			arr[0] =0;
			arr[1] = 1;
		}
		else if(n >2) {
			arr[0] =0;
			arr[1] = 1;
			for(int i=2; i<n; i++) {
				curr = pre1 + pre2;
				arr[i] = curr;
				pre1 = curr;
				pre2 = pre1;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}