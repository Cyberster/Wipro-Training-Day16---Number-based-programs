package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class FindPasswordStableUnstable {

	public int findPassword(int input1,int input2,int input3,int input4,int input5){
		// Read only region end
		int sumOfStable = 0;
		int sumOfUnstable = 0;
		
		if (isStable(input1)) sumOfStable += input1;
		else sumOfUnstable += input1;
		
		if (isStable(input2)) sumOfStable += input2;
		else sumOfUnstable += input2;
		
		if (isStable(input3)) sumOfStable += input3;
		else sumOfUnstable += input3;
		
		if (isStable(input4)) sumOfStable += input4;
		else sumOfUnstable += input4;
		
		if (isStable(input5)) sumOfStable += input5;
		else sumOfUnstable += input5;
		
		System.out.println(sumOfStable + " :: " + sumOfUnstable);
		System.out.println("isStable: " + isStable(input1) + isStable(input2) + isStable(input3) + isStable(input4) + isStable(input5));
		
		return sumOfStable - sumOfUnstable;
	}
	
	public static boolean isStable(int num) {
		boolean isStable = true;
		int[] freq = new int[10];
		String numStr = String.valueOf(num);
		
		for (int i = 0; i < numStr.length(); i++) {
			freq[Integer.parseInt(String.valueOf(numStr.charAt(i)))]++;
		}
		
		System.out.println(Arrays.toString(freq));
		
		int firstFreq = 0;
		for (int i = 0; i < 10; i++) {
			if (freq[i] > 0) {
				firstFreq = freq[i];
				break;
			}
		}
		System.out.println("firstFreq: " + firstFreq);
		
		for (int i = 0; i < 10; i++) {
			if (freq[i] != 0 && freq[i] != firstFreq) {
				isStable = false;
				break;
			}
		}
		System.out.println("isStable: " + isStable);
		
		return isStable;
	}
}