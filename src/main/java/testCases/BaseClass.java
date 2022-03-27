package testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utility.CaptureScreenshot;
import utility.ExcelData;
import utility.ReadConfig;

public class BaseClass {

	ReadConfig readconfig= new ReadConfig();
	   public ExcelData excel = new ExcelData();
		public String baseUrl=readconfig.getApplicationURL();
		public String screenshot=readconfig.getScreenshotPath();
		public String browser=readconfig.getBrowser();
		public static WebDriver driver;
		public static Logger logger;
		
		

		
		@BeforeSuite
		public void driversetup() {
			
			System.out.println(readconfig.getBrowser());
			
			
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		         driver=new ChromeDriver();
		         driver.manage().window().maximize();
			}
			else if (browser.equals("firefox")) {
				System.setProperty("webdriver.firefox.driver", "./drivers\\geckodriver.exe");
				driver =new FirefoxDriver();
				driver.manage().window().maximize();
			}
		}
		
		@BeforeClass
		public void setup() throws IOException
		{
				
		    logger=Logger.getLogger("nobroker");
		    PropertyConfigurator.configure("log4j.properties");
		    excel = new ExcelData();
		    

		    
		}
		
		@AfterSuite
		public void teardown()
		{
		 driver.quit();
		}
}

