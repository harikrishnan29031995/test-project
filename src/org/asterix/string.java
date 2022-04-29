package org.asterix;

public class string {
	public static void main(String[] args) {
		
	String input = "hari";
	String reverse = " ";
	for(int i = input.length()-1;i>=0;i--) {
		char charAt = input.charAt(i);
		reverse = reverse +charAt;
	}
	System.out.println(reverse);
	}
}
