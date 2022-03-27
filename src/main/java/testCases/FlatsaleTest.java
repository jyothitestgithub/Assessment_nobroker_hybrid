package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.FlatsalePage;
import PageObject.PostPage;
import utility.CaptureScreenshot;

public class FlatsaleTest extends BaseClass {
		@Test
		public void Flatsale() throws InterruptedException, IOException {
			logger.info("Flatsale test started");
			driver.get(baseUrl);
		    FlatsalePage fsp=new FlatsalePage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();
		    
		    fsp.nagar();
		      logger.info("User clicked on Flats for sale in T Nagr");
		      
		      Thread.sleep(6000);
		    	
		        if(driver.getPageSource().contains("Flats for Sale in T Nagar")) {
		        	logger.info("Page contains all the available options ");
		        	 Assert.assertTrue(true);
			 		  logger.info("--To check Flats for sale in T Nagar  Passed--");
			 	   }
			    	else {
			 		   
			 		  logger.info("--To check Flats for sale in T Nagar Failed--");
			 		 screenshot.takeScreenshot(driver);

			 		   Assert.assertTrue(false);
			 	   } 	  

}
}