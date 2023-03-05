package week.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		int input = 7;
		boolean prime = true;
		for (int i= 2; i<input; i++) {
			if (input%i==0) {
				System.out.println("Non Prime");
				prime = false;
				break;
				
				
			}
		}
	
	if (prime) {
		System.out.println("Prime Numbers");
	}
	}
	

}
