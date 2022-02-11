package org.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaExercise {
	public static void main(String[] args) {
		String s="SIMIYON";
		int vowels = 0;
		
		for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
		|| ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'
		|| ch == 'U') {
		vowels++;
		}
		
		}
		System.out.println(vowels); 
	
	}

}
