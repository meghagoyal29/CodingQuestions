package charregex;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBraces {

	public static boolean isBalanced(String expression) {

		String open = "([{";
		String close = ")]}";
		char[] chars = expression.toCharArray();
		Stack<Character>s = new Stack<>();
		boolean soFar = false;
		for(char c : chars) {

			if(open.indexOf(c)!=-1){
				s.push(c);
			}else{
				if(s.isEmpty()||open.indexOf(s.pop())!=close.indexOf(c)){
					soFar= true;

				}
				if(open.indexOf(s.pop())==close.indexOf(c)){
					return false;
				}
			}
		}
		if(!s.isEmpty())
			return false;
		return soFar;

	}
	/*
	 * Complete the braces function below.
	 */
	static String[] braces(String[] values) {
		String[] result  = new String[values.length];
		int i=0;
		String open = "{[(";
		String close = "}])";
		for (String value:values){
			//stack for opening braces
			Stack<Character> s = new Stack<>();
			String answer = "NO";
			if(value.length()%2!=0){
				result[i]=answer;
				i++;
				continue;
			}
			for(char c: value.toCharArray()){

				if(open.indexOf(c)!=-1){
					s.push(c);
				}else{
					if(s.isEmpty()||open.indexOf(s.pop())!=close.indexOf(c)){
						answer = "NO";
						break;
					}
					if(open.indexOf(s.pop())==close.indexOf(c)){
						answer = "YES";
					}
				}
			}
			result[i]=answer;
			i++;
			return result;

		}
		return result;
	}


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}

	// Complete the balancedOrNot function below.
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		int[] answers = new int[expressions.length];
		for (int i=0; i< expressions.length;i++) {
			answers[i] = findbalanced(expressions[i], maxReplacements[i]);
		}
		return answers;
	}
	private static int findbalanced(String string, int maxRep) {
		char[] chars = string.toCharArray();
		int opens = 0;
		
		int remaining = 0;
		for(int i = 0 ; i< chars.length;i++) {
			char thisChar = chars[i];
			if(thisChar=='<') {
				opens++;
			}else if(thisChar=='>') {
				if(opens>0) {
					opens--;
				}else {
					remaining++;
				}
			}
		}
	return (opens==0 && remaining<=maxRep)?1:0;
	}


}
