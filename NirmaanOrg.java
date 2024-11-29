package Day6;
import java.util.Scanner;
public class NirmaanOrg {
	
       int id=0;
       String name="";
       float salary=0;
       String department="";
       
       void empin(String intym) {
    	   System.out.println(intym);
          }
       void empout(String outym) {
    	   System.out.println(outym);
    	   
       }
       
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    	   NirmaanOrg emp1 = new NirmaanOrg();
    	   emp1.id=1314;
    	   emp1.name="sriram";
    	   emp1.salary=10000.05f;
    	   emp1.department="developer";
    	   emp1.empin("in time 9 clk");
    	   emp1.empout("out time 6 clk");
    	   
    	   System.out.println(emp1.id);
    	   System.out.println(emp1.name);
    	   System.out.println(emp1.salary);
    	   System.out.println(emp1.department);
    	   System.out.println();
    	   
    	   
    	   NirmaanOrg emp2 = new NirmaanOrg();
    	   System.out.println("Enter the values");
    	   emp2.id=scan.nextInt();
    	   emp2.name=scan.next();
    	   emp2.salary=scan.nextFloat();
    	   emp2.department=scan.next();
    	   System.out.println("thanks for the information");
	}
}
