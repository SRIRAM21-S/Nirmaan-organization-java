package Day21;

public class sss {
	int id;
	String name;
	int price;
	
	public sss() {                                  //empty con
		super();
	}
	
	

	public sss(int id, String name, int price) {    //parameter con
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public int getId() {                            // gettre and setter
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "sss [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
