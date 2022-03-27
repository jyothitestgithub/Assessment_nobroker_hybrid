package PageObject;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.LoginUI;
import utility.ExcelData;

public class LoginPage extends LoginUI {
	
	WebDriver ldriver;
	WebDriverHelper helper;
	public ExcelData excel=new ExcelData();
	String mobilenum=null;
	String password=null;

	

	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void login() {
		loginn.click();
		helper.implicitWait(ldriver, 5);
	}
	
public void number() throws IOException {
	ArrayList data=excel.getData("value");
	mobilenum = (String) data.get(1);

	mobile.sendKeys(mobilenum);
	 helper.implicitWait(ldriver, 5);
	//helper.Explicitwait(radio, 10);
}


public void radiobt() {
      radio.click();
      //helper.Explicitwait(pass, 10);
      helper.implicitWait(ldriver, 5);
}

public void password() throws IOException {
	ArrayList data=excel.getData("value");
	password = (String) data.get(2);

	pass.sendKeys(password);
}

public void contbt() {
 cont.click();
}

public boolean verify() {
	return check.isDisplayed();
}

}
