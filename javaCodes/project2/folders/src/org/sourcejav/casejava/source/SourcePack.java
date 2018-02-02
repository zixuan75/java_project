package org.sourcejav.casejava.source;

import java.io.IOException;
import java.util.Vector;

import org.sourcejav.casejava.main.ShowJava;

public class SourcePack {
	private String computeText;
	public SourcePack(String computeText) {
		// TODO Auto-generated constructor stub
		this.computeText=computeText;
	}
	public void initialization() {
		Vector<String> bufferVec=new Vector<String>();
		ShowJava java=new ShowJava(bufferVec);
		try {
			java.init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

