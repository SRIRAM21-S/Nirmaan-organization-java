package Day4;

import java.util.Scanner;

public class ForLoopCls2 {

	public static void main(String[]args) {
		
//		for (int i=1;i<=100;i++) {
//			if (i%5==0) {
//				System.out.println("sriram");
//			}
//			else {
//				System.out.println(i);
//			}
//			}
	
//		for (int i=1;i<=100;i++) {
//			if (i%2==0) {
//				System.out.println("even");
//			}
//			else {
//				System.out.println(i);
//			}
//			}
		Scanner cal=new Scanner(System.in);
		
	    
		   boolean isTrue=true;
		   
		   while(isTrue){
		   
		 	System.out.println(" Enter the value:");
		    System.out.println("0 is add");
		    System.out.println("1 is sub");
		    System.out.println("2 is mul");
		    System.out.println("3 is div");
		    System.out.println("4 is mod");
		    System.out.println("5 is exit");
		    
		    System.out.println("Enter the first value");
			 int firstnum=cal.nextInt();
			 System.out.println("Enter the second value");
			 int secnm=cal.nextInt();
			 
			 
		    int key=cal.nextInt();
		    
		    
		    switch (key) {
			
			case 0:
				System.out.println("addition :"+(firstnum+secnm));
				break;
			case 1:
				System.out.println("sub :"+(firstnum-secnm));
				break;
			case 2:
				System.out.println("mlutiple :"+(firstnum*secnm));
				break;
			case 3:
				System.out.println("division :"+(firstnum/secnm));
				break;
			case 4:
				System.out.println("mod :"+(firstnum%secnm));
				break;
				
			case 5:
				isTrue=false;
				System.out.println("function is exit");	
				break;
			default:{
				isTrue=false;
				System.out.println("enter the crct choice");
				break;
			}
			
				
				
			}
				
				
			}	
			
			
			
	
		
	
	
	
	}
	
	
	}
	
	
	
	

