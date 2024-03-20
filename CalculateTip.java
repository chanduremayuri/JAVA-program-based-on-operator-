import java.util.Scanner;

class CalculateTip
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subTotal ");
		double subTotal = sc.nextDouble();
		System.out.print("Enter the tipRate ");
		double tipRate =sc.nextDouble();

		double total =  subTotal+ tipRate*(subTotal/100);
		System.out.println("Subtotal is " + subTotal + " and tip rate "+ tipRate);
		System.out.println("Total is " + total);
		
		System.out.println("Thank you visit again");

	}	
}