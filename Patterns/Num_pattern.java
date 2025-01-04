package Patterns;

public class Num_pattern {
	public static void main(String[] args) {
		int n=5; 
		int v=0;
		for(int i=0;i<n;i++) {
			for(int s=0;s<(n-i)-1;s++) {
			System.out.print(" ");
			}
			 for(int j=0;j<(i*2)+1;j++) {
		           if(((i*2)+1)/2<j){
			     System.out.print(--v);    
			}
                           else{
		             System.out.print(j);
			     v = j;
			    }
				}
			System.out.println();
		}
        }
}
