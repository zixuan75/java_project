package org.sourcejav.textfile.java.casejava;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JLabel;

import org.sourcejav.casejava.source.SourcePack;
import org.sourcejav.casejava.string.tools.ColorList;
import org.sourcejav.casejava.string.tools.ListText;

public class TextFile {
	static String initializationText="";
	public TextFile() {
		;
	}
	public void initialization() {
		initializationText="made a text being used";
		initializationText=initializationText.substring(0, 4);
		if ( initializationText.isEmpty() )
			System.out.println("Error: Initialization Text is Empty!");
		String computeText=initializationText+" complete a text here";
		JLabel label=new JLabel(computeText);
		Font font=new Font("DejaVu Sans", 5, 12);
		label.setFont(font);
		computeText=label.getText().toString();
		if (! computeText.isEmpty() )
			System.out.println(computeText);
		String size=font.toString();
		if (! size.isEmpty() )
			System.out.println(size);
		SourcePack pack=new SourcePack(computeText);
		pack.initialization();
		try {
			System.in.close();
			ColorList colorList=new ColorList();
			colorList.init();
			ListText listText=new ListText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
