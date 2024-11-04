package Java_Tasks;
import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) {
		Reverse_number rn  = new Reverse_number();
		rn.reversenum();
		
	}
  public int reversenum() {
	  Scanner rev = new Scanner(System.in); //to get user input
	  System.out.println("Enter the numbers to be reversed: ");
	  int num = rev.nextInt();
	  
	  int reversednum = 0;
	  //calculation
	  while(num!=0) {
		int lst = num % 10; //to get last digit of any number
		reversednum = reversednum * 10 + lst;
		num = num / 10;
		}
	  System.out.println("Reversed number: " +reversednum);
	  rev.close();
	  return reversednum;//return the reversedsum 
	  
  }
	
	
}
