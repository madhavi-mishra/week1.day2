package week1.day2;

public class MyMobile {
int screenSize = 12;
	
	public void makeCall() {
System.out.println("Please Make a call");
	}
	public void sendMsg() {
		System.out.println("Please send a message");
	}
	private void payBills() {
		System.out.println("Have to pay bill till last day of month");
	}
	public static void main(String[] args) {
		MyMobile mobObj= new MyMobile();
		int screenSize2 = mobObj.screenSize;
	System.out.println("Screensize is " + screenSize2 );
	mobObj.makeCall();
	mobObj.payBills();
	mobObj.sendMsg();
	}
	
		
	}





