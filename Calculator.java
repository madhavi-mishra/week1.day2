package week1.day2;

public class Calculator {

	public void add(int a, int b, int c) {
		int s = a + b + c;
		System.out.println("Sum of given numbers are: " + s);

	}

	public void sub(int x, int y) {
		int z = x - y;
		System.out.println("Subtracted value: " + z);
	}

	public void mul(double p, double q) {
		double r = p * q;
		System.out.println("Multiple of  numbers are: " + r);
	}

	public void div(float g, float h) {
		float f = g / h;
		System.out.println("Division of numbers are : " + f);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(10, 20, 30);
		obj.sub(90, 20);
		obj.mul(15, 35);
		obj.div(12.5f, 3.5f);
		

	}

}
