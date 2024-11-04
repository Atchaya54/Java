package Java_Tasks;

public class Product_ofdigits {

	public static void main(String[] args) {
		int num = 234;
		int res = pod(num);
		System.out.print("The product of number 234 is " +res);
		
		}

	public static int pod(int n) {
		
		int product = 1;
		while(n >0) {
			int digit = n % 10;
			product = product * digit;
		n = n / 10;
		}
		
		
		return product;
	}

}
