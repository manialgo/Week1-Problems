/*
Q13. Character Type (Easy)
Determine whether the given character is an alphabet, a digit, or a special character.
Input format :
A single character.
Output format :
alphabet / digit / special
Sample test cases :
Input :
A
Output :
alphabet
Input :
7
Output :
digit
Input :
@
Output :
special
*/
package week1;
import java.util.Scanner;
public class CharacterType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		if(letter >=48 && letter <=57) System.out.print("digit");
		else if((letter>=65 && letter <=90) || (letter >=97 && letter <=122)) System.out.print("alphabet");
		else System.out.print("special");
		sc.close();
	}
}
