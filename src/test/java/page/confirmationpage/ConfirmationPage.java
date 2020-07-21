package page.confirmationpage;
import static page.confirmationpage.ConfirmationPageLocators.CONFIRMATIO_WINDOW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import page.BasePage;

public class ConfirmationPage extends BasePage {
     
    public WebElement lookForElement(By by) {
   	return super.lookForElement(by);
       }
    public boolean isDispalyed() {
	return lookForElement(CONFIRMATIO_WINDOW).isDisplayed();
	
    }
}
