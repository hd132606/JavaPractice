package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrl = "http://ojsfile.ohmynews.com/STD_IMG_FILE/2015/0426/IE001823904_STD.jpg";
		try{
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				
				int result;
				
				while ((result = is.read()) != -1)
	                os.write(result);

	            byte[] buf = new byte[100];

	            while ((result = is.read(buf)) != -1)
	                os.write(buf, 0, result);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
