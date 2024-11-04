package Java_Tasks;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		pal.palindrome();		
	}
 public boolean palindrome() {
	 Scanner inp = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int pl =  inp.nextInt();
	 int num = pl;
	 int pal = 0; 
	 
	 while(pl !=0) {
		 int number = pl % 10;
		 pal = pal * 10 + number;
		 pl = pl / 10;
	 }
		 
	 
	 
	 if (num==pal) {
		 System.out.println("True");
	 }
	 else {	
		 System.out.println("False");
	 }
	 
	 inp.close();
	return false;
 }
}
