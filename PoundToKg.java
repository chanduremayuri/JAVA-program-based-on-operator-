import java.util.Scanner;

class PoundToKg

 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in pounds :");
		double pound = sc.nextDouble();
		double kg =pound * 0.454;
		System.out.print(pound +" is "+kg+ " kilogram");
		

		
		
	}	
}