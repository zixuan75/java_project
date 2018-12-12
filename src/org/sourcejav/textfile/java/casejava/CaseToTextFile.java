package org.sourcejav.textfile.java.casejava;

public class CaseToTextFile {
	public static String initializingVector;
	public void CaseToTextFile() {
		System.out.println("How about initialize?");
		initialize();
	}

	private void initialize() {
		initializingVector=new String("UnderVector");
		System.out.println(initializingVector);
	}
	
}
