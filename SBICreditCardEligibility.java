/*
Q10. SBI Credit Card Eligibility (Hard)
Check eligibility for SBI Credit Cards based on criteria:
- Primary applicant age: 21 to 60 years
- Add-on card applicant age: above 18 years
- Employment type: Salaried(1), Self-employed(2), Student(3), Retired pensioner(4)
- Income: up to Rs.3 lakh per year
Input format :
First line: Age of primary applicant
Second line: Age of add-on card applicant
Third line: Employment type code
Fourth line: Income
Output format :
Eligible / Not Eligible
Sample test cases :
Input :
45
20
2
300000
Output :
Yes. You are eligible for SBI credit cards
Input :
45
15
2
300000
Output :
No. You are not eligible for SBI credit cards
 */
package week1;
import java.util.Scanner;
public class SBICreditCardEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int priAge, addAge, employmentType, income;
		priAge = sc.nextInt();
		addAge = sc.nextInt();
		employmentType = sc.nextInt();
		income = sc.nextInt();
		if((priAge >=21 && priAge <=60) && (addAge>18) && (employmentType >=1 && employmentType <=4) && (income <= 300000)) {
			System.out.println("Yes. You are eligible for SBI credit cards");
		} else System.out.println("No. You are not eligible for SBI credit cards");
		sc.close();
	}
}