package com.ugurozalp.test;

public class Test {
	public static void main(String[] args) {
		
		String number = "";
		int length = String.valueOf(number).length();
		System.out.println("length: " + length);
		String date = "2017-09-13";
		System.out.println(date.length());
		
		System.out.println(date.substring(0, 4));
		System.out.println(date.substring(5, 7));
		System.out.println(date.substring(8, 10));
		
		String dd = "206.0";
		System.out.println(dd.split("\\.")[1].length());
		if (dd.split("\\.")[1].length()<=2) {
			System.out.println("e");
			dd=dd.concat("0");
		}
		System.out.println(dd);
		
	}
}
