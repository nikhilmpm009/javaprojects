package hello;

public class maths {

	public static void main(String[] args) {
		int num = 250;
		System.out.println("this is num:" + num);
		num = num * 2;
		System.out.println("the value of num * 2 is");
		System.out.println(" == " + num + " is the out put");
		Calculator cacio = new Calculator();
		int sum = cacio.sum(9, 7);
		System.out.println("the sum is " + sum);
	}
}