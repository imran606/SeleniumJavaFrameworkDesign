package com.proName.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties  {

	public static void main(String[] args) {
		
	
	Properties prop=new Properties();
	FileInputStream fis= null;
	
	try {
		fis=new FileInputStream("C:\\Users\\IMRAN\\eclipse-workspace\\newjavaProject\\DataDrivenFrameWork\\src\\test\\resources\\excel");
		
	}
	catch(IOException e){
		e.printStackTrace();
	
}
	}
