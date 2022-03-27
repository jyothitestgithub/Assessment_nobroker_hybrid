package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.PostPage;
import PageObject.WarehousePage;
import utility.CaptureScreenshot;

public class WarehouseTest extends BaseClass {
			@Test
			public void Warehouse() throws InterruptedException, IOException {
				logger.info("Warehouse test started");
				driver.get(baseUrl);
			    WarehousePage wp=new WarehousePage(driver);
			    CaptureScreenshot screenshot =new CaptureScreenshot();
			    
			    wp.commercial();
			       logger.info("User clicked on Commercial");
			       
			       wp.wareh();
			       logger.info("User clicked on Warehouse for Rent in Gurgaon");
			       
			       Thread.sleep(5000);
				    
			        if(driver.getPageSource().contains("Warehouse")) {
			        	logger.info("Page contains all the available options ");
			        	 Assert.assertTrue(true);
				 		  logger.info("--To check warehouses for rent  Passed--");
				 	   }
				    	else {
				 		   
				 		  logger.info("--To check warehouses for rent Failed--");
				 		 screenshot.takeScreenshot(driver);

				 		   Assert.assertTrue(false);
				 	   }
}
}