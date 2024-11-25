package Day2;
import java.util.Scanner;

public class SimpleCal {
	public static void main(String[] agrs) {
		
		Scanner cal=new Scanner(System.in);
		System.out.println("Enter the first value");
	 int firstnum=cal.nextInt();
	 System.out.println("Enter the second value");
	 int secnm=cal.nextInt();
	    
	    System.out.println(" Enter the value:");
	    System.out.println("0 is add");
	    System.out.println("1 is sub");
	    System.out.println("2 is mul");
	    System.out.println("3 is div");
	    System.out.println("4 is mod");
	    int key=cal.nextInt();
//	    if(key==0) {
//	    	int finalvalue =(firstnum+secnm);
//	    	
//	    	System.out.println("total :"+finalvalue);
//	    	
//	    }
//	    else if(key==1) {
//	    	int finalvalue =(firstnum-secnm);
//	    	
//	    	System.out.println("total :"+finalvalue);
//	    	  }
//	    else if(key==2) {
//	    	int finalvalue =(firstnum*secnm);
//	    	
//	    	System.out.println("total :"+finalvalue);
//	    	  }
//	    else if(key==3) {
//	    	int finalvalue =(firstnum/secnm);
//	    	
//	    	System.out.println("total :"+finalvalue);
//	    	  }
//	
//	    else if(key==4) {
//	    	int finalvalue =(firstnum%secnm);
//	    	
//	    	System.out.println("total :"+finalvalue);
//	    	  }
//	

	
	
	switch (key) {
	
	case 0:
		System.out.println("addition :"+(firstnum+secnm));
	case 1:
		System.out.println("sub :"+(firstnum-secnm));
	case 2:
		System.out.println("mlutiple :"+(firstnum*secnm));
	case 3:
		System.out.println("division :"+(firstnum/secnm));
	case 4:
		System.out.println("mod :"+(firstnum%secnm));
		
		
		
		
		
		
	}	
	}
}