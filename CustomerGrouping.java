/*
Q9. Customer Grouping (Medium)
Customers are grouped according to age and gender.
Group 1: Males under 25 years old
Group 2: Females under 25 years old
Group 3: Males between 25 - 45 years old
Group 4: Females between 25 - 45 years old
Group 5: All people over 45 years old.
Note : Gender code for a male is 1 and for female is 2. Display Invalid if user enters other gender
codes.
Input format :
Age in first line
Gender code in second line
Output format :
Group number
Sample test cases :
Input :
23
1
Output :
Group 1 
*/
package week1;
import java.util.Scanner;
public class CustomerGrouping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(), genderCode = sc.nextInt();
		if((age>0) && (genderCode==1 || genderCode==2)) {
		if(age < 25 && genderCode == 1) {
			System.out.println("Group 1");
		}
		if((age>=25 && age <=45) && genderCode ==1 ){
			System.out.println("Group 3");
		}
		if(age < 25 && genderCode == 2) {
			System.out.println("Group 2");
		}
		if((age>=25 && age <=45) && genderCode ==2 ){
			System.out.println("Group 4");
		}
		if(age>45) System.out.println("Group 5");
		} else System.out.println("Invalid entry");
		sc.close();
	}
}