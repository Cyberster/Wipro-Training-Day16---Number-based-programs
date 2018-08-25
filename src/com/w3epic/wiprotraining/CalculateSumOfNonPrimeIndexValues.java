package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class CalculateSumOfNonPrimeIndexValues {
	public int sumOfNonPrimeIndexValues(int[] input1,int input2){
		// Read only region end
		int sum = 0;
		
		for (int i = 0; i < input2; i++) {
			if (!isPrime(i)) {
				System.out.print(i + ":: " + input1[i] + " ");
				sum += input1[i];
			}
		}
		
		return sum;
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1 || 0 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				//System.out.println("1");
				return false;
			}
		}
		//System.out.println("2");
		
		return true;
	}
}