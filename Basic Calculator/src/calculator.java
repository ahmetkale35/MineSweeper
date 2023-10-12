import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.transform.Source;

public class calculator {

	public static void main(String[] args) {
		Scanner sca1 = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1 = sca1.nextInt();
		System.out.print("Enter the second number : ");
		int n2 = sca1.nextInt();
		
		System.out.println("Please Choose the operations");
		System.out.println("[1]- Plus(+)");
		System.out.println("[2]- subtraction(-)");
		System.out.println("[3]- Multiplication(*)");
		System.out.println("[4]- division(/)");
		
		int cho = sca1.nextInt();
		
		switch(cho){
			case 1:
				System.out.print("Result : " + (n1+n2));
				break;
			case 2:
				System.out.print("Result : " + (n1-n2));
				break;
			case 3:
				System.out.print("Result : " + (n1*n2));
				break;
			case 4:
			    if (n2 != 0) {
			        float result = (float)n1 / n2;
			        System.out.println("Result : " + result);
			    } else {
			        System.out.println("Division by zero is not allowed.");
			    }
			    break;
			default:		
				System.out.println("İnvalid selection ");
		}
	}

}
