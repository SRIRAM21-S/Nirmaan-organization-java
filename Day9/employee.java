
package Day9;

public class employee {
	
	private String name;
	private int age;
	private long phNo;
	private String department;
	
	employee(){
		
	}
	
	employee (String name,int age,int phNo,String department){
		
		this.name=name;
		this.age=age;
		this.phNo=phNo;
		this.department=department;
	}
		
		public void setname(String name) {
			
			this.name=name;
		 }

		public void setage(int age) {
			
			this.age=age;
		 }
		

		public void setphNo(long phNo) {
			
			this.phNo=phNo;
		 }
		

		public void setdepartment(String department) {
			
			this.department=department;
			
			
		 }
		
		public String toString() {
			return "your name is :"+name+"\n your age is :"+age+"\n your phone num :"+phNo+"\n your department is :"+department;
		}
		
         public  String getName() {
        	  return name;
          	}
  	
         public int getage() {
        	  return age;
          	}
  	
         public long getphNo() {
        	  return phNo;
          	}

				
         public String getdepartment() {
			return department;
			}
		
		
	
		
		
		
}

