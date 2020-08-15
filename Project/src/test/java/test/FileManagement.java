package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileManagement {
	
	public static void main(String[] args) throws IOException {
		
		
		String path="C:\\Ravibabu\\Temp\\Time.txt";
		FileInputStream fis= null;
		BufferedInputStream bis=null;
		File f= new File(path);
		
		try {
			fis= new FileInputStream(f);
			bis=new BufferedInputStream(fis);
			while(bis.available()>0) {
				System.out.println();
			}
			
		}catch(Exception e) {
			
		}finally{
			if(fis!=null && bis!=null) {
				fis.close();
				bis.close();
			}
				
		}
		
	
	}

}
