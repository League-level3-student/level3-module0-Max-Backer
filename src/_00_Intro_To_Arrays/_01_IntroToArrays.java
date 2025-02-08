package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		Random rand = new Random();
		// 1. declare and Initialize an array 5 Strings
		String[] strArray = { "a", "b", "c", "d", "e" };

		// 2. print the third element in the array
		System.out.println(strArray[2]);
		// 3. set the third element to a different value
		strArray[2] = "L";
		// 4. print the third element again
		System.out.println(strArray[2]);

		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = "o";
		}

		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		// 7. make an array of 50 integers
		int[] intArray = new int[50];

		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rand.nextInt(0, 50);
		}

		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallestNumber = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < smallestNumber) {
				smallestNumber = intArray[i];
			}
		}
		System.out.println();
		
		System.out.println(smallestNumber);

		// 10 print the entire array to see if step 8 was correct
		System.out.println();
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}


		// 11. print the largest number in the array.
		int largestNumber = intArray[0];
		
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > largestNumber) {
				largestNumber = intArray[i];
			}
		}
		System.out.println();
		
		System.out.println(largestNumber);
		
		System.out.println();
		
		// 12. print only the last element in the array
		
		System.out.println(intArray[49]);

	}
}
