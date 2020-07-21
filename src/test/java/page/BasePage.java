package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingletion;

public class BasePage {
   private WebDriver driver =DriverSingletion.getDriver();
      
    protected WebElement lookForElement(By by) {
   	return driver.findElement(by);
       }
    public void open(String padgeURL) {
   	driver.get(padgeURL);
    }
    

}
