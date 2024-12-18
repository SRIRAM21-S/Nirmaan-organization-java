package JavaAssessment2;

public class TempletClss {
	
	
	String name;
	int AccNo;
	int pinNum;
	int phNum;
	int bal;
	
	public TempletClss() {
		
	}
	
	public TempletClss(String name, int accNo, int pinNum, int phNum,int bal) {
		super();
		this.name = name;
		this.AccNo = accNo;
		this.pinNum = pinNum;
		this.phNum = phNum;
		this.bal=bal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public int getPinNum() {
		return pinNum;
	}

	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}

	public int getPhNum() {
		return phNum;
	}

	public void setPhNum(int phNum) {
		this.phNum = phNum;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	
	}

	
	


		
	
	
	
	
	


