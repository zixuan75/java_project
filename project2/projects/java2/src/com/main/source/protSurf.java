package com.main.source;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.sourcejav.textfile.java.casejava.TextFile;

import com.applet.source.*;
import com.applet.source.toolwindows.main.ShowWindow;

public class protSurf {
	public static void main(String[] args) throws IOException {
		combine dnaCombine=new combine();
		dnaCombine.combineWriter();
		ShowWindow window=new ShowWindow();
		window.showWindow();
		TextFile text=new TextFile();
		text.initialization();
	}
}
