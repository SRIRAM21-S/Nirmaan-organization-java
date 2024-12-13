package Day15;
import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		calculator calc=new calculator();
		Scanner cal= new Scanner(System.in);
		System.out.println("enter the first value");
		int firstnum=cal.nextInt();
		System.out.println(" enter the second value");
		int secnum=cal.nextInt();
		System.out.println(calc.add(firstnum, secnum));
		System.out.println(calc.sub(firstnum, secnum));
		System.out.println(calc.mul(firstnum, secnum));
		System.out.println(calc.div(firstnum, secnum));
	}
	

}
