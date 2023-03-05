package week.day1;

public class Fibbinocci {
	
//	Output 0  1  1  2  3  5  8  13  21  34  55  89  144
//	Hints: 
//		Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//		Print first number
//		Iterate from 1 to the 11
//		Add first and second number assign to sum
//		Assign second number to the first number
//		Assign sum to the second number
//		Print sum


	public static void main(String[] args) {

		int firstNum = 0;
		int SecNum = 1;
		int Sum =0;
		
		System.out.println(firstNum);
		System.out.println(SecNum);
		for (int i = 0; i<11; i++){
			Sum=firstNum+SecNum;
			System.out.println(Sum);
			firstNum=SecNum;
			SecNum = Sum;
		}
		
	}

}
