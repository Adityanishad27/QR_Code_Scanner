package com.generate;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class generate {

	public static void main(String[] args) {
		
		try {
			
			// path where generated QR location
			File file= new File("C:\\Users\\Aditya\\Downloads\\abc.png");
			
			// QR content 
			String content="This is my QRContent";
			
		ByteArrayOutputStream out =	QRCode.from(content).to(ImageType.PNG).stream();
		
		FileOutputStream fileout= new FileOutputStream(file);
		
		fileout.write(out.toByteArray());
		
		fileout.close();
		
		System.out.println("Generated Succefully");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}


