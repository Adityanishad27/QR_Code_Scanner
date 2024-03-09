package com.reader;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;



public class Reader {

    public static void main( String[] args ) {
	
	try {
		
		JFileChooser ch= new JFileChooser();
		
		ch.showOpenDialog(null);
		
		File f=ch.getSelectedFile();
		
		
		if(f==null) {
			
			throw new  Exception("Invalid file Selection.......");
			
		}
		
		
		//path selection file
	//	File f= new File("C:\\Users\\Aditya\\Downloads\\Untitled.png");
		Result r= new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(f)))));
		
		System.out.println(r.getText());		
	} catch (Exception e) {
		e.printStackTrace();
	}

	
}


}
