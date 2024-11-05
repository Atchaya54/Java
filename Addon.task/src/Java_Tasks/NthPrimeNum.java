package Java_Tasks;

public class NthPrimeNum {

	public static void main(String[] args) {
		int Num = 6;
		int res = prime(Num);
		System.out.println("The 6th Prime number is:"  +res);
	}
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
			}
		
		for(int i=2;i<num;i++) {
			if(num % i == 0)
			return false;
		}
		return true;
		
	}
	
	public static int prime(int n) {
		int count = 0;
		int num = 1;
		while(count < n) {
			num++;
			if(isprime(num)) {
				count++;
			}
		}
		
		   return num;	
	}

}
