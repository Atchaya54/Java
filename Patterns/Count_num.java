package Patterns;

import java.util.Scanner;

public class Count_num {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i = 0;
    while (i<str.length()) {
            int j=i+1;
            int count =1;
            while(j<str.length()){
 if(str.charAt(i)==str.charAt(j)) {
                count++;
                 }else{
                     break;
                 }
                 j++;
            }
 System.out.println("count: " + count + " Value: " + str.charAt(i));
            i=j;
        }

        in.close();
    }

}
