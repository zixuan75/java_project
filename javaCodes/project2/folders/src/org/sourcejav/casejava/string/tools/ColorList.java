package org.sourcejav.casejava.string.tools;

import java.io.IOException;
import java.util.Vector;

public class ColorList {

	public void init() {
		Vector<Integer> intVec=new Vector<Integer>();
		int thisBuffer=System.out.hashCode();
		for (int i=0; i < thisBuffer; ++i) {
			int available=i;
			intVec.addElement(new Integer(available) );
		}		
		System.setErr(System.err);
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
