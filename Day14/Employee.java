package Day14;

public class Employee {
	private String name;
	private int age;
	private int id;
	private int salary;
	private int ph;
	
	
	
	
	public Employee() {
	}
	
		
		
		
	public Employee(String name, int age, int id, int salary, int ph) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
		this.ph = ph;
	}




	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", \nage=" + age + ", \nid=" + id + ", \nsalary=" + salary + ", \nph=" + ph + "]";
	}

}
