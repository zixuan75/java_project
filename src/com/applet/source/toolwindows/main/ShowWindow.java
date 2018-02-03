package com.applet.source.toolwindows.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.applet.source.toolwindows.tools.ToolsWindow;

public class ShowWindow extends JPanel{
    private static final String INVALID_AGE = "Invalid age!";
    private static Action action = new NewFileAction();
    private static JFrame frame = new JFrame("Sourcejav");
    private static Action folderAction = new NewFolderAction();
    private static Action saveAction = new SaveAction();
    private static Action gotoAction = new GoToAction();
    private static JTextArea textArea=new JTextArea(9, 30);
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private static JMenu fileMenu;
    private static JMenuBar fileMenuBar;
    private static JTextField fileField;
    private static JTextField saveField;
    private static JTextField textField;
    private static JTextField ageField;
    private static JLabel res;
    private static String sources;
    public ShowWindow() {
    	setLayout(new BorderLayout());
    	JPanel eastPanel = new JPanel(new GridLayout(4, 4, 36, 66));
    	fileMenu=new JMenu("File");
    	fileMenuBar=new JMenuBar();
    	fileMenu.add(new JMenuItem(action));
    	fileMenu.add(new JMenuItem(saveAction));
    	fileMenu.add(new JMenuItem(folderAction));
    	fileMenu.add(new JMenuItem(gotoAction));

    	saveField=new JTextField(15);
    	fileMenu.add(saveField);

    	JMenuBar menuBar = new JMenuBar();
    	fileMenuBar.add(fileMenu);
    	JMenu menu = new JMenu("File");
    	menu.add(new JMenuItem(action));
    	menu.add(new JMenuItem(folderAction));
    	menuBar.add(menu);
    	eastPanel.add(menuBar);
    	eastPanel.add(new JButton(action) );
    	add(eastPanel, BorderLayout.EAST);
    	JPanel southPanel = new JPanel();
    	Font font=new Font("DejaVu Sans", 5, 12);
    	textArea.setFont(font);
    	southPanel.add(textArea);
    	JLabel fileLabel = new JLabel("File:");
    	southPanel.add(fileLabel);
    	fileField=new JTextField(15);
    	southPanel.add(fileField);
    	add(southPanel, BorderLayout.SOUTH);

    	JPanel northPanel = new JPanel();
    	northPanel.setLayout(new FlowLayout());
    	JLabel label = new JLabel("Customing Project:");
    	northPanel.add(label);

    	ageField = new JTextField(15);
    	northPanel.add(ageField);
    	JLabel folderLabel = new JLabel("Create Folder/File label:");
    	northPanel.add(folderLabel);
    	textField=new JTextField(15);
    	northPanel.add(textField);
    	add(northPanel, BorderLayout.NORTH);

    	JPanel centerPanel = new JPanel();
    	JButton btn = new JButton("Customize");
    	btn.addActionListener(new BtnListener());
    	centerPanel.add(btn);
        ToolsWindow window=new ToolsWindow(res);
    	res = new JLabel();
    	res.setVisible(false);
    	centerPanel.add(res);

    	add(centerPanel, BorderLayout.CENTER);
    }
    public void showWindow() {
    	frame.add(new ShowWindow());
    	frame.setVisible(true);
    	frame.setSize(1200, 550);
    	frame.setJMenuBar(fileMenuBar);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private static class NewFolderAction extends AbstractAction{
    	public NewFolderAction() {
    		putValue(NAME, "New a folder ");
    		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_N));
    	}
    	public void actionPerformed(ActionEvent ae) {
    		File fileS=new File("/mnt/windows/newFolder");
    		fileS.mkdir();
    		boolean newFile=true;
    		if (newFile) {
    			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
    					new FileOutputStream(textField.getText().toString() ), "utf-8"))) {
        			frame.add(textArea);
        			textArea.setBackground(Color.blue);
    				writer.close();
            System.out.println("A new folder\n"+textField);
            sources="folder at them\nSystem new folder here: "+textField.toString();
    			} catch (FileNotFoundException e){
    				e.printStackTrace();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    }
    private static class GoToAction extends AbstractAction{
    	public GoToAction() {
    		putValue(NAME, "Go to a line");
    		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_U));
    	}
    	public void actionPerformed(ActionEvent ae) {
        Scanner s=new Scanner(System.in);
    		if (s.hasNextLine() ) {
    			if (s.nextLine() == "2") {
    				if (s.hasNextLine() && s.nextLine()=="3") {
    					try {
    						String previousLine="";
    						if (s.nextLine()=="4")
    							previousLine=s.toString();
    						Scanner s2=new Scanner(s.findInLine("%3"));
    						if (s2.hasNextLine() ) {
    							String nextLine=s.next();
    							s2.findInLine(nextLine);
    							String next=s.next();
    							if (s2.nextLine()=="2") {
    								nextLine=s2.nextLine();
    								System.out.println(nextLine);
    								String prevLine=s.toString();
    								previousLine=prevLine.substring(0, 1);
    							}
    						}
    						System.in.close();
    					} catch (IOException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    				}
    			}
    		}
    		if (s.hasNextLine() ){
    			String var = new String("Goto Line");
    			if (var != null){
    				if (s.hasNextLine()){
    					Scanner s3 = s;
    					String nextLine=s3.nextLine();
              boolean actionFinished=false;
    					nextLine="Next Line: "+s3.nextLine();
    					String var2=nextLine.substring(10, 30);
    					while (s3 == null) {
    						s3=new Scanner(var);
    						nextLine=s3.nextLine();
    					}
    					String previousLine=var2.toString();
    					nextLine=previousLine.substring(10, 42);
              String nextLineFunc="";
    					System.out.println(var);
    					if (s3.nextLine()=="5"){
    						String next=s3.next();
    						next.concat(System.lineSeparator() );
    						boolean hasNextLine=s3.hasNextLine();
    						if (hasNextLine || s3.nextLine()=="6"){
    							nextLineFunc=s.nextLine();
    							var="Goto Line Action: "+s3.nextLine();
    						}
    					}
              String var3=s3.nextLine()+nextLineFunc.substring(10, 14);
              nextLineFunc.concat(var3);
              nextLine=nextLineFunc+previousLine.substring(10, 28);
              if (nextLineFunc != null){
                nextLineFunc.concat(System.lineSeparator() );
                var2=s.nextLine()+s.toString()+nextLine+previousLine+"Action";
                String var4=var2.substring(10, 56);
              }
    					if (s3.hasNextLine() ){
    						var3=var+s.nextLine();
                actionFinished=true;
    					}
    				}
    			}
          if (s.nextLine()=="7"){
            String nextToPrevLine=s.nextLine()+":"+s.toString();
            System.out.println("Next Line to Previous Line: "+nextToPrevLine);
          }
    		}
    	}
    }
    private static class SaveAction extends AbstractAction{
    	public SaveAction() {
    		putValue(NAME, "Save File");
    		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_7));
    	}
    	public void actionPerformed(ActionEvent ae) {
    		String sField=saveField.getText().toString();
    		BufferedReader br = null;
    		File fileS= new File(sField);
			try {
				br = new BufferedReader(new FileReader(sField));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
        System.out.println(sources);
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				FileOutputStream out = new FileOutputStream(fileS,true);
				String everything = textArea.getText();
				String myString2 = everything.replace("\r", "\t");
				out.write(myString2.getBytes() );
				out.write("\n".getBytes() );
				out.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    	}
    }
    private static class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String content = ageField.getText();
            int age = -1;
            try{
                age = Integer.parseInt(content);
                if(isValid(age)) {
                    res.setText("age: "+age);
                } else {
                    res.setText(INVALID_AGE);
                }
                if(!res.isVisible())
                    res.setVisible(true);
            } catch(NumberFormatException ex) {
                res.setText("Wrong input");
            }
        }

        private boolean isValid(int age) {
            return age > MIN_AGE && age < MAX_AGE;
        }
    }
    private static class NewFileAction extends AbstractAction{
    	public NewFileAction() {
    		putValue(NAME, "New a text file");
    		putValue(SHORT_DESCRIPTION,"Finally that could new file such as text file");
    		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_N));
    	}
    	public void actionPerformed(ActionEvent ae) {
    		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
    				new FileOutputStream(fileField.getText().toString() ), "utf-8"))) {
    			writer.write("An java writed file");
    		} catch (FileNotFoundException e){
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
}
