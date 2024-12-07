package Day10;
import java.util.Scanner;
public class SingleBookManagement {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
	TheBook b1=new TheBook();
		
		b1.settitle("master mind");
		b1.setauthor("sriram");
		b1.setprice(400.05);
		b1.setNum(100);
		
		//System.out.println(b1.toString());
		boolean isTrue=true;
		while (isTrue) {
//		System.out.println(b1);
		System.out.println(" 1 for add ");
		System.out.println(" 2 for udate ");
		System.out.println(" 3 for show");
		System.out.println(" 0 for exit ");
	
		
		
		int key=scan.nextInt();
		scan.nextLine();
		switch (key) {
		case 1: {
			
			System.out.println("enter your title");
			String title=scan.nextLine();
			b1.settitle(title);
			System.out.println("enter the author name");
			String author=scan.nextLine();
			
			b1.setauthor(author);
			System.out.println("enter the price");
			double price=scan.nextDouble();
			
			b1.setprice(price);
			System.out.println("enter the num f copy");
			int NumOfbook=scan.nextInt();
			
			b1.setNum(NumOfbook);
			break;
		}
		case 2: {
			System.out.println(b1.toString());
			break;
			
		 	}
		case 3: {
			
			System.out.println(b1);
			break;
	
	
			}
		case 0: {
			
			isTrue=false;
			break;
	 	}
		default:
		{
			System.out.println("Enter the crct choice");
		}
		}
	}
	
	}
}
