import java.util.Scanner  ;


class MethodUse
  {
	public static void main (String [] args)
            {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1  st string:");
		String a = sc.next();
		sc.nextLine();
 		System.out.print("Enter the 2 st string:");
		String b = sc.nextLine();
                System.out.print("Enter the character :");
		char ch = sc.next().charAt(2);
  		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("ch:"+ch);

	     }
}
