package FirstTerm;

import java.util.Scanner;

public class Week13Examples {
	public static int UpperLowerCountChecker(String input) {
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<input.length();i++){
			
			if(input.charAt(i)>='A'&&input.charAt(i)<='Z') 
			uppercase++;
		if(input.charAt(i)>='a'&&input.charAt(i)<='z') 
			lowercase++;
		}
		if(uppercase==lowercase)
		return 0;
		else if(uppercase>lowercase)
		return 1;
	else
		return -1;
		}
	public static String findletter(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) <= 'Z' && input.charAt(i) >= 'A' || input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				output += input.charAt(i);
			}
		}
		return output;
	}

	public static String findletter_recursive(String input) {
		if (input.length() == 0) {
			return "";
		}
		if (input.charAt(0) <= 'Z' && input.charAt(0) >= 'A' || input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
			return input.charAt(0) + findletter_recursive(input.substring(1, input.length()));
		}
		return findletter_recursive(input.substring(1, input.length()));
	}

}
