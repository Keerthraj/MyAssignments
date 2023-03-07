package week.day2;

public class Calculator {
	
	//creating the method 
	public int add(int x,int y,int z) {
		 int sum =x+y+z;
		return sum;	
	}

	public int mul(int a,int b) {
		int result =a*b;
		return result;
	}
		public void sub() 
		{
			System.out.println("Subtraction");
		}
		
		 
	public static void main(String[] args) {
		Calculator cal2 = new Calculator();
		System.out.println(cal2.add(3, 5, 6));
		System.out.println(cal2.mul(12, 4));
		cal2.sub();
		
				
	} 
	
	}

