package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.ElectPage;
import PageObject.PostPage;
import utility.CaptureScreenshot;

public class ElectTest extends BaseClass {
		@Test
		public void Elect() throws InterruptedException, IOException {
			logger.info("Elect test started");
			driver.get(baseUrl);
		    ElectPage ep=new ElectPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();
		    
		    

		    ep.scroll();
	        logger.info("User clicked on  Miscellaneous");
	        ep.electrician();
	        logger.info("User clicked on  Electrician Services Bangalore");
	        
	        Thread.sleep(7000);
	        if(driver.getPageSource().contains("Electrician")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To verify Electrican service Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To verify Electrican service Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	        	
		    
}
}