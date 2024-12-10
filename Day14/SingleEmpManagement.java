package Day14;
import java.util.Scanner;
public class SingleEmpManagement {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Employee emp1=new Employee();
		
		boolean isTrue=true;
		while(isTrue) {
			
			System.out.println("0 for exit");
			System.out.println("1 for add");
			System.out.println("2 for show ");
			
			int key=scan.nextInt();
			scan.nextLine();
			
			switch (key) {
			
			case 1: {
				System.out.println("Enter your name");
				String name=scan.nextLine();
				emp1.setName(name);
				
				System.out.println("Enter your age");
				int age=scan.nextInt();
				emp1.setAge(age);
				

				System.out.println("Enter your id");
				int id=scan.nextInt();
				emp1.setId(id);
  

				System.out.println("Enter your salary");
				int salary=scan.nextInt();
				emp1.setSalary(salary);
				

				System.out.println("Enter your ph");
				int phoneNum=scan.nextInt();
				emp1.setPh(phoneNum);
				
				break;
    }
			
			case 2:{
				System.out.println(emp1);
				break;
			}
				
			
			
			case 0:{
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

