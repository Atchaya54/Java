package Java_Tasks;

public class NthFibonacci {

	public static void main(String[] args) {
		NthFibonacci fibo = new NthFibonacci();
		System.out.println(fibo.fibonacci()); 
			

	}
	
	public int fibonacci() {
		int a = 0,b =1,fib =0, n =7;
		
		for(int i =2; i <=n;i++) {
			fib = a+b;
			a=b;
			b= fib;
		}
		
		
		return fib;
	}

}
