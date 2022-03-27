package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AboutPage;
import PageObject.PostPage;
import utility.CaptureScreenshot;

public class AboutTest extends BaseClass {
		@Test
		public void About() throws InterruptedException, IOException {
			logger.info("Post test started");
			driver.get(baseUrl);
		    AboutPage ap=new AboutPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();

		    ap.down();
	        logger.info("User clicked on About us");
	        
	        Thread.sleep(5000);
	        if(driver.getPageSource().contains("Welcome to NoBroker!")) {
	        	logger.info("Page contains Sell or Rent your Property For Free ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check About Us  Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check About Us Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  

}
}