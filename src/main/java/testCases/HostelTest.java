package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HostelPage;
import PageObject.PostPage;
import utility.CaptureScreenshot;

public class HostelTest extends BaseClass {
		@Test
		public void Hostel() throws InterruptedException, IOException {
			logger.info("Post test started");
			driver.get(baseUrl);
		    HostelPage hp=new HostelPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();
		    
		    hp.hostel();
	        logger.info("User clicked on PG in Powai");

             Thread.sleep(5000);
	    	
	        if(driver.getPageSource().contains("PG in Powai")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check PG or Hostel Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check PG or Hostel Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	    

		    
}
}