package Java_Tasks;

public class PerfectNumber {

	public static void main(String[] args) {
		PerfectNumber perfectnum =new PerfectNumber();
		System.out.println(perfectnum.perfect());
		

	}
	public boolean perfect() {
		int num = 28;
		int sum = 0;
		 for(int i =1; i<=num/2;i++) {
			 if(num%i ==0) {
				 sum = sum + i;
				
				 
			 }
			 }		 
		
		return sum==num;
	}

}
