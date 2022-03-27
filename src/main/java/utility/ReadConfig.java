package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties pro;
	public ReadConfig()
	{
		File src=new File("./Configuration\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String baseUrl=pro.getProperty("baseUrl");
		return baseUrl;
	}
	
	public String getBrowser()
	{
	String browser=pro.getProperty("browser");
	return browser;
	}
	
	public static  String getScreenshotPath() {
		String screenshot=pro.getProperty("screenshotPath");
		return screenshot;
		//return pro.getProperty("screenshotPath");
	
	}
	
		
		}
