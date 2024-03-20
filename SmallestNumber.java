import java.util.Scanner;

class SmallestNumber {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int num2 = sc.nextInt();
		int min =(num1>num2)? num1 :num2 ; 
		System.out.println(num1 + " , "+num2 + "Smallest among 2 number is " + min);
     }
}							

		