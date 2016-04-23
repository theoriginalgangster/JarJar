package com.fail;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

  public static void main (String [] args) throws Exception {
    
    //Get Temp directory size in bytes
    long dirSize = FileUtils.sizeOfDirectory(new File("/Temp"));
  
    String htmlButton = "<html style='background: lightblue'><h1 style='color:red'>Random String : </h1>" + RandomStringUtils.randomAlphabetic(6) + "<br>" +
              "Temp directory size : " + FileUtils.byteCountToDisplaySize(dirSize) + "</html>";
    
    JFrame frame = new JFrame("My Application");
    frame.getContentPane().add(new JButton(htmlButton));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setSize(200, 200);
    frame.setLocation(240, 90);
    frame.setVisible(true);
  }
}
