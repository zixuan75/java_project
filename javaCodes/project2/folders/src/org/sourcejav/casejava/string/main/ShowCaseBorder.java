package org.sourcejav.casejava.string.main;

import java.io.IOException;
import java.util.Vector;

import org.sourcejav.casejava.string.tools.Vague;

public class ShowCaseBorder {
	private String toolsList;
	private static String mainStr;
	public ShowCaseBorder(String toolsList) {
		// TODO Auto-generated constructor stub
		this.toolsList=toolsList;
	}

	public void init() {
		mainStr=toolsList;
		Vector<String> vectorVec=new Vector<String>();
		vectorVec.add(mainStr);
		vectorVec.add(toolsList);
		vectorVec.addElement(mainStr);
		for (int i=0; i < vectorVec.size(); ++i) {
			if (! mainStr.isEmpty() )
				toolsList.concat(mainStr);
		}
		if (! mainStr.contains(toolsList) ) {
			System.err.println(toolsList+": Could not contain two items (ShowCaseBorder.java:27).");
			return;
		}
		if (! vectorVec.isEmpty() ) {
			String vaque="all systems not vague";
			vectorVec.addElement(vaque);
		}
		String nearture=toolsList.substring(0, 4);
		vectorVec.add(nearture);
		for (int i=0; i < vectorVec.size(); ++i)
			nearture.concat(mainStr);
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector<Vague> vagueVec;
		Vague vague=new Vague(toolsList);
		vague.initialization();
	}
}