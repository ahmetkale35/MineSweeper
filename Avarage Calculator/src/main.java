import java.util.Scanner;

import javax.naming.AuthenticationException;

public class main {

	public static void main(String[] args) {
		Scanner sca1 = new Scanner(System.in);
		System.out.print("Enter the midscore : ");
		int midscore = sca1.nextInt();
		
		System.out.print("Enter the quiz note : ");
		int quiz = sca1.nextInt();
		
		System.out.print("Enter the final note : ");
		int finalscore = sca1.nextInt();
		
		double avarage = (0.1)*quiz + (0.4)*midscore + (0.5)*finalscore;
		System.out.println("Your avarage : " + avarage);

		String result = (avarage > 50) ? "You Passed the course" : "You Failed the course";
		System.out.println(result);
	
	}
}
