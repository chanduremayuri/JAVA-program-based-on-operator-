import java.util.Scanner;
class SumOfDigits {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int dup = num;
		int sum =0;
		sum = sum + num % 10;
		num = num /10;
		sum = sum + num % 10;
		num = num /10;
		sum = sum + num % 10;
		System.out.println("Sum odf the digit is "+ sum + "and the number is "+dup);
     }
}							

		