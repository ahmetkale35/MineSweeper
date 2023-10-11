import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		float ratio = 0.18f;
		Scanner sca1 = new Scanner(System.in);
		System.out.print("Enter the price of product : ");
		int price = sca1.nextInt();
		System.out.println();
		float vatprice = (ratio*price)+ price;
		System.out.println("price with value added tax : " + vatprice);
		
	}

}
