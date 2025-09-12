/*
Q12. Descending Order of 4 Numbers (Easy)
Arrange four numbers in descending order.
Input format :
Four integers separated by spaces.
Output format :
Numbers in descending order.
Sample test cases :
Input :
5 8 2 9
Output :
9 8 5 2 
*/
package week1;
import java.util.Scanner;
public class DescendingOrderOf4Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		int temp;
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<4; j++) {
			for(int k=j+1; k<4; k++) {
				if(arr[j] < arr[k]) {
					temp = arr[j]; 
					arr[j] = arr[k];
					arr[k] = temp;			
				}
			}
		}
		for(int a:arr) System.out.print(a + " ");
		sc.close();
	}
}