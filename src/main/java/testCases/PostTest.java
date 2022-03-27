package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.PostPage;
import utility.CaptureScreenshot;



public class PostTest extends BaseClass {
		@Test
		public void Post() throws InterruptedException, IOException {
			logger.info("Post test started");
			driver.get(baseUrl);
		    PostPage pp=new PostPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();

		    
		    pp.property();
	        logger.info("User clicked on Post Free property ad");
	        
	        Thread.sleep(5000);
	        if(driver.getPageSource().contains("Sell or Rent your Property For Free")) {
	        	logger.info("Page contains Sell or Rent your Property For Free ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To verify Post property Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To verify Post property Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
}
}