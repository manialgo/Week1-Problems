/*
Q11. Triangle Shape (Easy)
Check whether a triangle is Equilateral, Isosceles, or Scalene.
Input format :
Sides of the triangle in separate lines.
Output format :
Type of triangle.
Sample test cases :
Input :
18
18
18
Output :
Equilateral Triangle
Input :
12
25
15
Output :
Scalene Triangle
Input :
52
52
323
Output :
Isosceles Triangle 
*/
package week1;
import java.util.Scanner;
public class TriangleShape {
	static void eq(int a, int b, int c) {	
		if(a==b && a ==c && b==c) System.out.println("Equilateral Triangle");
		if(a==b || b==c || a==c) System.out.println("Scalene Triangle");
		if(a !=b && a!=c && b!=c) System.out.println("Isosceles Triangle");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		eq(a, b, c);

		sc.close();
	}
}