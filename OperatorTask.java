package Day1;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
int firstNum=12;
int SecNum=25;

int Addition=firstNum-SecNum;
Scanner operation = new Scanner(System.in);

		
		System.out.println("Arithmatic operation");
		System.out.println("Addition:"+(firstNum+SecNum));
		
		System.out.println("Substraction:"+(firstNum-SecNum));
		System.out.println("multiplication: "+(firstNum*SecNum));
		System.out.println("Division: "+(firstNum/SecNum));
		System.out.println("Modulus: "+(firstNum%SecNum));
		System.out.println("multiplication: "+(firstNum*SecNum));
		
		System.out.println("Relational operation");
		System.out.println("12>25:"+(firstNum>SecNum));
		System.out.println("12<25:"+(firstNum<SecNum));
		System.out.println("12>=25:"+(firstNum>=SecNum));
		System.out.println("12<=25:"+(firstNum<=SecNum));
		System.out.println("12==25:"+(firstNum==SecNum));
		System.out.println("12!=25:"+(firstNum!=SecNum));	
		System.out.println("");
		
int ThirdNum=5;
int FourthNum=10;

        System.out.println("Logical Operation");
		System.out.println("12>10 AND 25<50:"+(ThirdNum<FourthNum));
		System.out.println("12<10 AND 25>50:"+(ThirdNum>FourthNum));
		
	}

}

