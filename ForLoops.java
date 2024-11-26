package Day3;
import java.util.Scanner;
public class ForLoops {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num i give you a table");
		int table= sc.nextInt();
	
		
	for(int i=0;i<=10;i++) 
		System.out.println(table+"x"+i+"="+i*table);
	
	
		

}
}