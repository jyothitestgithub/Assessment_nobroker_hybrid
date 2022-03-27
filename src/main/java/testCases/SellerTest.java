package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.PostPage;
import PageObject.SellerPage;
import utility.CaptureScreenshot;

public class SellerTest extends BaseClass {
		@Test
		public void Seller() throws InterruptedException, IOException {
			logger.info("Seller test started");
			driver.get(baseUrl);
		    SellerPage sp=new SellerPage(driver);
		    CaptureScreenshot screenshot =new CaptureScreenshot();
		    
		    sp.menuss();
	        logger.info("User clicked on Menu");
	        
	        sp.plan();
		      logger.info("User clicked on Seller Plans");

}
}