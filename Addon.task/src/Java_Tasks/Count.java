package Java_Tasks;

public class Count {

	public static void main(String[] args) {
		Count cnt = new Count();
		cnt.count();
		

	}
	public int count() {
		int num = 12345;
		int res = String.valueOf(Math.abs(num)).length();
		System.out.println(res);
		return res;
	}

}
