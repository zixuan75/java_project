package com.applet.source;

import java.io.*;
import java.util.Vector;

import javax.swing.JLabel;

public class combine {
	public combine() {;}
	public static Vector<String> bStringVec;
	public void combineWriter() {
		bStringVec=new Vector<String>();
		File fileS=new File("/mnt/windows/java/combined");
		fileS.mkdir();
		
		JLabel bStringLabel=new JLabel();
		String bString=new String();
		bString="Hi everything";
		bStringVec.add(bString);
		bStringLabel.setText(new Integer(bStringVec.size() ).toString() );
		bString=bStringLabel.getText();
		
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
