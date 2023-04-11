package week3.day1;

public class Calculator {

	
	public int add(int a, int b) {
		
		return a+b;
		
		
	}
	
public int add(int a, int b, int c) {
		
		return a+b+c;
		
	}
	
public int mul(int a, double b) {
	
	int c;
	return c=(int) (a*b);
	
}

public double mul(double a, double b) {
	
	return a*b;
	
}




	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		
		int add = calc.add(5, 10);
		System.out.println(add);
		
		int add2 = calc.add(10, 20, 30);
		System.out.println(add2);

		int mul2 = calc.mul(23, 455.10);
		System.out.println(mul2);

		double mul = calc.mul(45.45, 84.43);
		System.out.println(mul);		
		
		
		
		
	}

}
