package day8;

public class constructor {
	String name;
	int age;
	int rollno;
	char grade;
	
	constructor(String name,int age,int rollno,char grade){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.grade=grade;
		
	}
	
	
	public static void main(String[] args) {
		constructor cls=new constructor("sriram",20,1245,'a');
		
		System.out.println(cls.name);
		System.out.println(cls.age);
		System.out.println(cls.rollno);
		System.out.println(cls.grade);
		
		
	}
	
	

}
