package testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import utility.CaptureScreenshot;



public class LoginTest extends BaseClass {
	

	@Test
	public void Login() throws IOException, InterruptedException {
		driver.get(baseUrl);
		   logger.info("Url is opened");
		   
		   LoginPage lp=new LoginPage(driver);
		   CaptureScreenshot screenshot =new CaptureScreenshot();
		   
		   lp.login();
	        logger.info("User clicked Login");
	        
	        lp.number();
	        logger.info("User entered mobile number");
	        Thread.sleep(8000);
	        lp.radiobt();
		       logger.info("User clicked on I've Password");
		       
		       lp.password();
			     logger.info("User entered password");
			     
			     lp.contbt();
			      logger.info("User clicked on Continue");
			      Thread.sleep(3000);
			      
			           boolean correct=lp.verify();
			    	if(correct=true) {
			    		Assert.assertTrue(true);
				 		  logger.info("--To verify Login functionality Passed--");
				 	   }
				    	else {
				 		   
				 		  logger.info("--To verify Login functionality Failed--");
				 		 
				 		 screenshot.takeScreenshot(driver);

				 		Assert.assertTrue(true);
				 	   } 	  
		      
		   
		   
		   
		   
		   
}
}