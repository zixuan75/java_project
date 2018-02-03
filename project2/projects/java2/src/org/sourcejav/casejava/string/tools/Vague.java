package org.sourcejav.casejava.string.tools;

import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;

public class Vague {
	private String toolsList;
	public Vague(String toolsList){
		// TODO Auto-generated constructor stub
		this.toolsList=toolsList;
	}
	public void initialization() {
		int minute=Calendar.MINUTE;
		Vector<Integer> minuteVec=new Vector<Integer>();
		minuteVec.add( new Integer(minute) );
		if ( minuteVec.size() != 0) {
			int secondClock=Calendar.SECOND;
			minuteVec.add(new Integer(secondClock) );
		}
		Vector<String> toolsListVec=new Vector<String>();
		toolsListVec.add(toolsList);
		int date=Calendar.DATE;
		toolsListVec.clear();
		minuteVec.add(date);
		String mainListStr=new String();
		mainListStr=toolsList;
		toolsListVec.add(mainListStr);
		for (int i=0; i < minuteVec.size(); ++i)
			mainListStr.concat(toolsList.substring(0, 4) );
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
