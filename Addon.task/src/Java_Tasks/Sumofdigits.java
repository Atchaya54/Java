package Java_Tasks;
import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Sumofdigits sod = new Sumofdigits();
		sod.sumofdigits(); //calling sumofdigits method
		
	}
	    public int  sumofdigits() {
	    //to get user input	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int sum = 0;
		//calculation
		 while(number!=0) {
			 sum += number % 10;
			 number = number/ 10;
		 }
		 System.out.println("Sum of digits:" +sum);
		 scanner.close();
		 return sum; //return the calculated sum
		
	}
	

}
