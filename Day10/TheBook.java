package Day10;

public class TheBook {
	
	String title;
	String author;
	double price;
	int Num;
	
	TheBook(){
		
	}
	
	TheBook(String title,String author,double price,int NumOfbook){
		
		this.title=title;
		this.author=author;
		this.price=price;
		this.Num=NumOfbook;
		}
	
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int getNomOfBook() {
		return Num;
		}
	
	
	
	public void settitle(String title) {
		this.title=title;
		
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setNum(int Num) {
		this.Num=Num;
	}
	
	public String toString() {
		return "title of the book   :"+title+"\nname of the author  :"+author+"\nprice of the book   :"+price+"\nnum of the ook sold :"+Num;
	}
		
}

