package test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.confirmationpage.ConfirmationPage;
import page.errormessagepage.ErrorMessagePage;
import page.signinpage.SignPage;

public class LoginTest extends BaseTest{
    ConfirmationPage confirmationPadge;
    ErrorMessagePage errorMessagePage;
    SignPage signPadge;
    
    @BeforeMethod
    public void setup() {
	signPadge = new SignPage();
	confirmationPadge = new ConfirmationPage();
	errorMessagePage = new ErrorMessagePage();
	signPadge.open();
	signPadge.clearLogin();
	signPadge.clearPassword();
		
    }

    @Test(description = "Все поля валидные")
    public void successfullLogin() {
	signPadge.insertLogin("demo");
	signPadge.insertPassword("demo");
	signPadge.clickLoginButton();
	
	Assert.assertTrue(confirmationPadge.isDispalyed());
	
    }
  
    @Test(description = "Все поля пустые")
    public void emptyFields() {
	signPadge.clickLoginButton();
	
	Assert.assertTrue(errorMessagePage.isDispalyed());
//	Assert.assertTrue(confirmationPadge.isDispalyed());
    }
    
    @Test(description = "Поле пароль пустое")
    public void oneEmptyFields() {
	signPadge.insertLogin("demo");
	signPadge.clickLoginButton();
	
	Assert.assertTrue(errorMessagePage.isDispalyed());
	
    }
    @Test(description = "Логин, пароль несуществующего пользователя")
    public void noExistUser() {
	signPadge.insertLogin("1111");
	signPadge.insertPassword("1111");
	signPadge.clickLoginButton();
	
	Assert.assertTrue(errorMessagePage.isDispalyed());
	
    }
        
    @Override
    @AfterTest
    public void tearDown() {
	super.tearDown();
	signPadge = null;
	confirmationPadge = null;
	errorMessagePage = null;
    }
    

}
