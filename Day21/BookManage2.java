package Day21;

import java.util.*;

public class BookManage2 {
	public static void main(String[] args) {
		ArrayList<sss> arr=new ArrayList<sss>();
		Scanner scan=new Scanner(System.in);
		sss b1=new sss();
		 boolean istrue=true;
		
		while (true) {
		System.out.println("1 for enter the name");
		System.out.println("2 for show ");
		System.out.println("3 for update");
		System.out.println("0 for exit");
		int key=scan.nextInt();
		scan.nextLine();
		switch (key) {
		case 1:{
			System.out.println("enter the book id");
			int id=scan.nextInt();
			scan.nextLine();
			
			
			System.out.println("enter the book name");
			String name=scan.nextLine();
			
			
			System.out.println("enter the book price");
			int price=scan.nextInt();
			scan.nextLine();
			
			
			arr.add(b1 = new sss(id,name,price));
			break;
		}
		case 2:{
			System.out.println(arr);
			break;
		}
		case 3:{
			System.out.println("enter the book id ");
			int id=scan.nextInt();
			scan.nextInt();
			for(sss s1:arr) {
				if(id==s1.getId()) {
					System.out.println("enter the book name");
					String name=scan.nextLine();
					s1.setName(name);
					System.out.println("enter the price");
					int price=scan.nextInt();
					s1.setPrice(price);
				}else {
					System.out.println("enter the crt book id");
					break;
				}
			}
		}
			
				case 0:{
					istrue=false;
					System.out.println("Done");
				}
				
				}
		
		}
		
		}
	}
		