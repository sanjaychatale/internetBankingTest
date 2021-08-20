package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig()
	{
		{
			File src = new File("./Configuration/config.properties");

			try {
				FileInputStream fis = new FileInputStream(src);
				prop = new Properties();
				prop.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
				
		
	}
	public String getApplicationUrl()
	{
		String url=prop.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String userName=prop.getProperty("userName");
		return userName;
	}
	
	
	public String getUserPass()
	{
		String password=prop.getProperty("password");
		return password;
	}

	public String getChromePath()
	{
		String chromePath=prop.getProperty("chromepath");
		return chromePath;
	}
	
	public String getIePath()
	{
		String iePath=prop.getProperty("iepath");
		return iePath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
}
