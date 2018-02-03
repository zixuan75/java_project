package org.sourcejav.casejava.main;

import java.io.Console;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class ShowJava {
	private static Vector<String> bufferVec;
	public ShowJava(Vector<String> bufferVec) {
		// TODO Auto-generated constructor stub
		this.bufferVec=bufferVec;
	}
	public void init() throws IOException { 
		int searchPlace=9;
		for (int i=0; i < searchPlace; ++i) {
			int available=i;
			Vector<Integer> intVec=new Vector<Integer>();
			intVec.addElement(new Integer(available) );
			System.setIn(System.in);
		}
		System.in.close();
		String buffer="vague";
		if (bufferVec.add(buffer) ) 
			buffer.concat(bufferVec.toString() );
		
		Map<String, Vector<String>> map = new HashMap<String, Vector<String>>();
	    Vector<String> vec = new Vector<String>();
	    vec.add("This is a example");
	    map.put("1stExample", vec);
	    String mapBuffer=map.toString();
	    bufferVec.addElement(mapBuffer);
	}

}
