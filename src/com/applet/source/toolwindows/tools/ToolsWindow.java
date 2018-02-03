package com.applet.source.toolwindows.tools;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.sourcejav.casejava.string.main.ShowCaseBorder;

public class ToolsWindow extends JPanel{
	private static final String INVALID_AGE = "Invalid age!";
	private static final String VALID_AGE = "Valid";
	private static String toolsList;
	private static JLabel res;
	public ToolsWindow(JLabel res) {
		this.res=res;
		this.res = new JLabel();
		this.res.setText(VALID_AGE);
		JButton btn = new JButton("Hello");
		if ( this.res.equals(btn) )
			this.res.setText(INVALID_AGE);
		add(btn);

		initialization();
	}
	public void initialization() {
		JPanel southPanel = new JPanel();
		res.setVisible(true);
		southPanel.add(res);
		add(southPanel, BorderLayout.SOUTH);

		if (res != null)
			System.out.println("res:"+res.getText() );

		toolsList="demo string!";
		String rerachcable=toolsList.substring(0, 4);
		if (! rerachcable.isEmpty() ) {
			toolsList=rerachcable;
			res.setBounds(10, 30, 120, 230);
		}else {
			rerachcable=res.getText();
			JLabel label=new JLabel(rerachcable);
			southPanel.add(label);
		}
		try {
			System.in.close();
			ShowCaseBorder border=new ShowCaseBorder(toolsList);
			if (this.res.equals(res) )
				border.init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		format(true);
	}
	private void format(boolean format) {
		if (format==true) {
			System.out.println("Format Posts\n");
			String formatting="demo string\ndemostring";
			toolsList=formatting;
			res.setText(toolsList);
			if (! formatting.contains(toolsList) ) {
				System.err.println(toolsList+": Could not contain two items (ToolsWindow.java:66).");
				return;
			}else
				System.out.println("Contained items");
			boolean formatToExtended=true;
			if (formatToExtended) {
				toolsList=toolsList.substring(0, 4);
				System.out.println(toolsList);
				if (toolslist == formatting){
					res.setText(formatting);
					return;
				}
				String var = formatting.substring(0, 4);
				System.out.print(var+"\n");
			}
		}
	}
}
