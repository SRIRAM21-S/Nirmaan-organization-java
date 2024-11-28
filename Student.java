package Day5;

public class Student {
	int sNo=0;
	String name ="";
	String DoB="0";
	int rollNo=0;
	int age=0;
	String hobbies="";
	
	public static void main(String[] args) {
		
		Student k1=new Student ();
		k1.sNo=1;
		k1.name="SRIRAM";
		k1.DoB="21/01/2004";
		k1.age= 20;
		k1.rollNo=1341;
		k1.hobbies="Dance,art";
		
		System.out.println("sNo             :"+k1.sNo);
		System.out.println("Studen name     :"+k1.name);
		System.out.println("Student age     :"+k1.age);
		System.out.println("Date of brith   :"+k1.DoB);
		System.out.println("Studen Roll no  :"+k1.rollNo);
        System.out.println("hobbies         :"+k1.hobbies);
	
	
	}

}
