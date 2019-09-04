//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	
 
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextIn
	Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(6);
	
	System.out.println(randomNumber);
	JOptionPane.showInputDialog("enter a question");
	
	if(randomNumber==0) {
		JOptionPane.showMessageDialog(null, "yes");}
if(randomNumber==1) {
	JOptionPane.showMessageDialog(null, "Nooooooooooooooooooooooooo");}
if(randomNumber==2) {
JOptionPane.showMessageDialog(null, "jarvis your insane");}
if(randomNumber==3) {
	JOptionPane.showMessageDialog(null, "In your dreams");}
	if(randomNumber==4) {
		
// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}}}















































