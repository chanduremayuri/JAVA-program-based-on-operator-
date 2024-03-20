import java.util.Scanner;
class EvenOdd3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Entered number is Even number ");
		}
		else 
		{
			System.out.println("Entered number is odd number ");
		}
	}
}