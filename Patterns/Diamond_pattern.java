package Patterns;

public class Diamond_pattern {
	public static void main(String[] args) {
        int n = 3;
        int v = n+n-1 ;
        for(int i=0;i<v;i++){
            if(i<v/2){
                for(int s=0;s<v-i-n;s++){
                    System.out.print(" ");
                }
                for(int j=0;j<v+(i*2)-4;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i==v/2){
                
                for(int j=0;j<v;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int s=0;s<(v+i)/3-1;s++){
                    System.out.print(" ");
                }
                for(int j=0;j<(v-i)*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        
        
    }

}
