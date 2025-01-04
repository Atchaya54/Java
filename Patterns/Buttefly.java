package Patterns;

public class Buttefly {
	 public static void main(String[] args) {
	        int n=6;
	        n=n*2-1;
	        for(int i=0;i<n;i++){ 
	            if(i<n/2)
	            {
	            for(int j=0;j<i+1;j++){
	                    System.out.print("*"); 
	            }
	            for(int s=0;s<n-(i+1)*2;s++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<i+1;j++){
	                    System.out.print("*"); 
	            }
	            System.out.println();
	            }
	            else if(i==n/2){
	                for(int j=0;j<n;j++){
	                    System.out.print("*"); 
	                  
	            }
	              System.out.println();
	            }else{
	                 for(int j=0;j<n-i;j++){
	                    System.out.print("*"); 
	            }
	            for(int s=0;s<(i*2)-n;s++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<n-i;j++){
	                    System.out.print("*"); 
	            }
	            System.out.println();
	            }
	            
	        }
	    }

}
