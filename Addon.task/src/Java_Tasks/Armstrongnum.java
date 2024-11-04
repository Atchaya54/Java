package Java_Tasks;

import java.util.Scanner;


public class Armstrongnum{

	public static void main(String[] args) {
		Armstrongnum arm =  new Armstrongnum();
		
		
		if(arm.armstrong()) {
			 System.out.println("True");
		}else {
			 System.out.println("False");
		}

	}
	
	public boolean armstrong() {
		
		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int scanner =  inp.nextInt();
		 int originalnum = scanner;
		 int sum = 0 ;
		 int digits = String.valueOf(scanner).length();	
		 
		 while(scanner > 0) {
			 int digit = scanner % 10;
			 sum += Math.pow(digit, digits);
			 scanner /= 10;
			 
			 
		 }
		 inp.close();
		 return sum == originalnum ;
	}

}
