package week.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
        //output: 2,5,7
        
        //loop through a number(outer loop)
        //loop through the next number(inner loop)
        //compare both the variables using if condition
        //print the duplicate value 
        for(int i = 0; i < nums.length; i++) {  
            for(int j = i + 1; j < nums.length; j++) {  
                if(nums[i] == nums[j])  
                    System.out.println("Duplicate number:"+ nums[i]);  
            }  
        }  
    }  
}  