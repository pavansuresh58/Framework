package com.SwagLabs.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead 
{
	public Properties p1;
	
	
	public PropertiesRead(String file)
	{
		 p1 =new Properties();
		  File f1=new File(System.getProperty("user.dir")+"//"+file+".properties");
		  FileInputStream fs;
		  try {
			fs=new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
			  
	}
	
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
	

}