package Patterns;

public class Num3_pattern {
	public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            int v = i;
            for (int j = 1; j <= i; j++) {
               
                System.out.print(v + " ");
                v= v+(n - j);
            }
            System.out.println();
        }
    }

}
