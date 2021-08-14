package JavaMaven;

public class Assig1 {

	public static class CalculaterDay2Assig1 {
		public int sum() {
			// TODO Auto-generated method stub
			int a = 3;
			int b = 2;
			int c = 1;
			int w = a + b + c;
			return w;
		}

		public int difference() {
			// TODO Auto-generated method stub
			int a = 3;
			int b = 2;
			int x = a - b;
			return x;
		}

		public int product() {
			// TODO Auto-generated method stub
			int a = 3;
			int b = 2;
			int y = a * b;
			return y;
		}

		public int division() {
			// TODO Auto-generated method stub
			int a = 4;
			int b = 2;
			int z = a / b;
			return z;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CalculaterDay2Assig1 calculaterObj = new CalculaterDay2Assig1();
			int result = calculaterObj.sum();
			System.out.println("Sum of 3 numbers is " + result);
			int result1 = calculaterObj.difference();
			System.out.println("Difference from a to b is " + result1);
			int result2 = calculaterObj.product();
			System.out.println("Product of a and b " + result2);
			int result3 = calculaterObj.division();
			System.out.println("Division of a by b " + result3);
		}
	}

	

}
