package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BlogPage;
import PageObject.PostPage;
import utility.CaptureScreenshot;

public class BlogTest extends BaseClass {
	@Test
	public void Blog() throws InterruptedException, IOException {
		logger.info("Blog test started");
		driver.get(baseUrl);
	    BlogPage bp=new BlogPage(driver);
	    CaptureScreenshot screenshot =new CaptureScreenshot();

	    bp.menuss();
        logger.info("User clicked on Menu");
        
        bp.blog();
        logger.info("User clicked on Blog");
        
        
        Thread.sleep(2000);
        
        if(driver.getPageSource().contains("The NoBroker Times")) {
        	 Assert.assertTrue(true);
	 		  logger.info("--To check noboker's blog Passed--");
	 	   }
	    	else {
	 		   
	 		  logger.info("--To check nobroker's blog Failed--");
	 		 screenshot.takeScreenshot(driver);

	 		   Assert.assertTrue(false);
	 	   } 	  

}
}