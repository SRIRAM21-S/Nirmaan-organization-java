package Day20;
import java.util.Scanner;
public class Exception2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age= sc.nextInt();
		try {
			if(age>0) {
				System.out.println("your age is valid");
			}else {
				throw new ArithmeticException ();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
		
		
		
	}

}
