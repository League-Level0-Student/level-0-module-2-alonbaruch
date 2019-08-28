//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int a = 0;
		
		//3   Now to make number random. 
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		
		//3b. Next, set the value of number, using .nextInt() to get a random number from the Random object
		 Random ran = new Random();
		 a=ran.nextInt(88 -(-222)+1) -222;

		//4. Now limit the value of number to be between 0 and 100

		//5. Now limit the value of number to be between 25 and 75. Hint: 
		
		

		//6. Challenge: Limit the value of number to be between -222 and 88

		//1. Print out the value of number
		System.out.println(a);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
