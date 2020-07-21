package test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BasePage;
import page.confirmationpage.ConfirmationPage;
import page.errormessagepage.ErrorMessagePage;
import page.signinpage.SignPage;

public class LoginTest extends BaseTest{
    ConfirmationPage confirmationPadge;
    ErrorMessagePage errorMessagePage;
    SignPage signPadge;
    WebDriver driver;
    private static final Logger log = Logger.getLogger(BasePage.class);
    
    @BeforeMethod
    public void setup() {
	signPadge = new SignPage();
	confirmationPadge = new ConfirmationPage();
	errorMessagePage = new ErrorMessagePage();
//	driver = DriverSingletion.getDriver();
	signPadge.open();
	signPadge.clearLogin();
	signPadge.clearPassword();
	log.info("Open brauser");
		
    }
    
    @Test
    public void successfullLogin() {
	signPadge.insertLogin("demo");
	signPadge.insertPassword("demo");
	signPadge.clickLoginButton();
	
	Assert.assertTrue(confirmationPadge.isDispalyed());
	
    }
    @Test
    public void emptyFields() {
	signPadge.clickLoginButton();
	
	Assert.assertTrue(errorMessagePage.isDispalyed());
	
    }
    
    @AfterTest
    public void tearDown() {
	super.tearDown();
	log.info("close brauser");
	signPadge = null;
	confirmationPadge = null;
    }
    

}
