package week.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 131;
		boolean bprime = true;
		for(int i = 2; i < input ; i++) {
			if (input%i==0) {
				System.out.println("Non Prime");
				bprime = false;
				break;
			}
		}
		if (bprime) {
			System.out.println("Prime Number");
		}
	}

}
