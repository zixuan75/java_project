package org.sourcejav.casejava.string.tools;

public class ListText {

	public ListText() {
		// TODO Auto-generated constructor stub
		System.out.format("string", null);
		initialization("just a string");
	}
	public static void initialization(String traditional){
		System.out.println("In initialization\nat the same time");
		String init="string";
		init.concat(traditional);
	}

}
