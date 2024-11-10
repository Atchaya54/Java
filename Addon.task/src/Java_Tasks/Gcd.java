package Java_Tasks;

public class Gcd {

	public static void main(String[] args) {
		Gcd gcnum = new Gcd();
		int res = gcnum.gcd();
		System.out.println(res);
	}
	
	public int gcd() {
		int num1=56;
		int num2 = 98;
		
		while(num2!=0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
			
			
		}
		
		return num1;
	}

}
