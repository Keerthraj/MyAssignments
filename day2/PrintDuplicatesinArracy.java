package week.day2;

import java.util.Arrays;

public class PrintDuplicatesinArracy {
	public static void main(String[] args) {
	//Question:
		//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value
		
		
		int array[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Array length:"+ array.length);
		
		int count;
		int i,j;
		
		for (i = 0; i < array.length-1; i++) {
			count = 0;
			for(j=i+1; j<array.length; j++) {
				
				if(array[i]==array[j]) 
					System.out.println("Duplicate Values in array:" +array[i]);
				}
		
	
				
		}}}
		
		


