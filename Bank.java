package JavaAssessment2;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TempletClss acc=new TempletClss();
		
		acc.setName("Sriram");
		acc.setAccNo(123456789);
		acc.setPinNum(1234);
		acc.setPhNum(8978775);
		acc.setBal(1000);
		
          boolean istrue=true;
		
		while(istrue) {
		
	
		System.out.println("1 for check balance");
		
		System.out.println("0 for exit");
		
		
		     int key=sc.nextInt();
		     sc.nextInt();
		     
		     if(key==1 ){
		    	 System.out.println("entre your pin");
		    	 int enterpin=sc.nextInt();
		    	 
		    	 if(enterpin == acc.getPinNum()) {
		    		 System.out.println("welcome "+acc.getName());
		    		 System.out.println("your bank balance is"+acc.getBal());
		    		 
		    	 }else {
		    		 System.out.println("enter the correct pin");
		    	 }
		    		 
		    	 }else if (key==0) {
		    		 System.out.println("thank you");
		    		 break;
		    	 }else {
			    	 System.out.println("enter the crt value");
			     }
		     }
		    	 
		     }
		
		 {
			
	}
	
	

}
