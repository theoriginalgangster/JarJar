package com.fail;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

	public static void main (String [] args) throws Exception {
    
		JEditorPane editor = new JEditorPane();
		editor.setEditable(false);   

		try {
			editor.setPage("http://www.google.com");
		}catch (Exception e) {
			editor.setContentType("text/html");
			editor.setText("<html><h1>Failed to load page</h1></html>");
		} 

		JScrollPane scrollPane = new JScrollPane(editor);     
		JFrame frame = new JFrame("Test HTML");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(scrollPane);
		frame.setSize(1100, 500);
		frame.setLocation(240, 90);
		frame.setVisible(true);
	}
}
