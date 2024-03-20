import java.util.Scanner;

class FeetToMeter

 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for feet :");
		double feet = sc.nextDouble();
		double meter = feet * 0.305;
		System.out.print("Enter the value for feet :");
		System.out.print(feet+ " feet is  "+ meter +" meter");
		

		
		
	}	
}