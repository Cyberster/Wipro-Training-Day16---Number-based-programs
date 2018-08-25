package com.w3epic.wiprotraining;

import java.io.*;
import java.util.*;

// Read only region start
class FindTheOneDigitToBeRemovedToFormPalindrome {

	public int digitRemove_Palin(int input1){
		// Read only region end
		StringBuilder num = new StringBuilder(String.valueOf(input1));
		//System.out.println(num);
		
		for (int i = 0; i < num.length(); i++) {
			if (palindromeCheck(num.toString())) return -1;
			
			char removedChar = num.charAt(i);
			String newNum = num.deleteCharAt(i).toString();
			//System.out.println(i + ":: " + newNum);
			if (palindromeCheck(newNum)) {
			    System.out.println(i + ":: " + newNum + " :: " + removedChar);
				return Integer.parseInt(String.valueOf(removedChar));
			} else {
				num.insert(i, removedChar);
			}				
		}
		
		return -1;
	}
	
	public static boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;

		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;

		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}

		return isPalindrome;
	}
}