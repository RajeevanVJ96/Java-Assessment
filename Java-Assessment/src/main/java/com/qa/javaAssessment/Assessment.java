package com.qa.javaAssessment;

import java.util.ArrayList;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		String bert = "bert";
		String returned = "";
		String formatedInput = input.toLowerCase();
		if (formatedInput.contains(bert)){
			formatedInput = formatedInput.replaceFirst(bert, "");
			if(formatedInput.contains(bert)){
				formatedInput = formatedInput.replaceAll(bert, "");
				for (int i = 0; i < formatedInput.length(); i++){
					returned += formatedInput.charAt((formatedInput.length()-1) - i);
				}
				return returned;
			}else{
				return "";
			}

		}else{
			return "";
		}

	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		int lg = Math.max(Math.max(a, b), Math.max(b, c));
		int sm = Math.min(Math.min(a, b), Math.min(b, c));
		int md = 0;
		for (int i : nums){
			if (i == lg | i == sm){
				continue;
			}else {
				md = i;
			}
		}
		if ((lg - md) == (md - sm)){
			return true;
		}else{
			return false;
		}



	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
//		String formatedString = "";
//		if (((input.length()) % 2 == 1)){
//			if (a == 1){
//				formatedString = formatedString.replace(formatedString.substring((input.length()/2),((input.length()/2) + 1)),"");
//			}else{
//				formatedString = formatedString.replace(formatedString.substring((input.length()/a),a + 3),"");
//			}
//
//		}

		return "";
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		if (input == ""){
			return 0;
		}
		return 0;


	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		String input = arg1.toLowerCase();
		String[] arg1Split = input.split(" ");
		int counter = 0;
		for (String s: arg1Split){
			if (s == "am"){
				counter++;
			}
		}

		return counter;
		return -1;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {

		if (arg1 % 5 == 0) {
			if (arg1 % 3 == 0) {
				return "fizzbuzz";
			} else {
				return "buzz";
			}
		} else if (arg1 % 3 == 0) {
			if (arg1 % 5 == 0) {
				return "fizzbuzz";
			} else {
				return "fizz";
			}



		}
		return null;
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		ArrayList<Integer> totals = new ArrayList<Integer>();
		String[] args = arg1.split(" ");

		for (String s: args){
			int currentTotal = 0;
			for (char c: s.toCharArray()){
				System.out.println(c);
				currentTotal += (Integer.parseInt(String.valueOf(c)));
				//
			}
			totals.add(currentTotal);
		}

		int max = 0;
		for (int i:totals){
			if (i > max){
				max = i;
			}else{
				continue;
			}
		}
		return max;
	}
}
