package week.day2;

import java.util.Arrays;

public class MissingElementinArray {
	
	public static void main(String[] args) {
		
		// Here is the input
			//	int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
			
			int array[] = {1,2,3,4,7,6,8};

			// Sort the array	
			Arrays.sort(array);
			int n=0;

			for (int i = 0; i < array.length; i++)
			{
				n++;

				if(n != array[i])
				{
					System.out.println("Missing element : " + n);
					break;
				}
			}
		}
	
	}


