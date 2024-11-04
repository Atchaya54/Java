package Java_Tasks;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
	 Primenumber primenum = new Primenumber();
	 primenum.prime();
	}

	public int prime() {
	Scanner pri = new Scanner(System.in);	
	System.out.print("Enter the number: ");
	int pn = pri.nextInt();
	boolean isprime = true;
	
	if(pn <= 1) {
		
		isprime = false;
	}else {
		for(int i = 2;i<=pn/2;i++) {
			if(pn % i ==0) {
				isprime = false;
			}
		}
	}
	if(isprime) {
		System.out.println(pn + "  is a  Prime number.");
	}else {
		System.out.println(pn + "  is not a Prime number.");
	}
	
	pri.close();
		return pn;
	}
	
	
}
