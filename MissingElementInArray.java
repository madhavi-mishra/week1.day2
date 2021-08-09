package wee1day2.assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4, 7, 6, 8 };
		// Sort the array
		Arrays.sort(arr);
		// This method doesn't return any value

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i) {
				System.out.println("The missing element is : " + i);
				break;
			}

		}
		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

	}

}
