package Java_Tasks;

public class Divisors {

	public static void main(String[] args) {
		
Divisors dv = new Divisors();
 dv.divisors();                                            
}
	
public int divisors() {
		int num = 24;
		for(int i =1;i<=num;i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
			
		}
		
		return num;
	}
		


}
