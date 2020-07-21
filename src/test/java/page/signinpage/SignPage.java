package page.signinpage;
import static page.signinpage.SignPageLocators.*;
import page.BasePage;

public class SignPage extends BasePage{
    String padgeURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
	    	+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";
   
    public void clearLogin() {
   	lookForElement(USERNAME_INPUT).clear();
    }
    
    public void insertLogin(String login) {
	lookForElement(USERNAME_INPUT).sendKeys(login);
    }
    
    public void clearPassword() {
   	lookForElement(PASSWORD_INPUT).clear();
    }
    public void insertPassword(String password) {
	lookForElement(PASSWORD_INPUT).sendKeys(password);
    }
    
    public void clickLoginButton() {
	lookForElement(SIGN_IN_BUTTON).click();
    }
    
    public void open() {
	super.open(padgeURL);
	
    }
   

}
