package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.PostPage;
import PageObject.RentalAgtPage;
import utility.CaptureScreenshot;

public class RentalAgtTest extends BaseClass {
		@Test
		public void RentalAgt() throws InterruptedException, IOException {
			logger.info("RentalAgt test started");
			driver.get(baseUrl);
		    RentalAgtPage rap=new RentalAgtPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();

		    rap.rental();
	        logger.info("User clicked on Rental Agreement under Rent in footer");
	        
            Thread.sleep(2000);
	    	
	        if(driver.getPageSource().contains("Rental Agreement")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check about Rental Agreement Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check about Rental Agreement Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	     
}
}