package page.errormessagepage;

import static page.errormessagepage.ErrorMessagePageLocators.ERROR_LOGIN_MESSAGE;

import page.BasePage;

public class ErrorMessagePage extends BasePage {
    public boolean isDispalyed() {
	return lookForElement(ERROR_LOGIN_MESSAGE).isDisplayed();
    }

}
