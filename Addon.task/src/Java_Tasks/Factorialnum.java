package Java_Tasks;

import java.util.Scanner;

public class Factorialnum {

	public static void main(String[] args) {

		Factorialnum fn = new Factorialnum();
		fn.factorail();
	}
	public int factorail() {
Scanner sc = new Scanner(System.in)	;	
System.out.print("Enter a number: ");
int number = sc.nextInt();
long fac = 1;
 for(int i = 1; i <= number;i++) {
	 fac = fac * i;
	}
System.out.print("Factorial of " + number + " is :" + fac );
sc.close();
return number;
	}

}
