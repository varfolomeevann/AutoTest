package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingletion;

public class BasePage {
   private WebDriver driver = DriverSingletion.getDriver();
      
    protected WebElement lookForElement(By by) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	return driver.findElement(by);
       }
    public void open(String padgeURL) {
   	driver.get(padgeURL);
    }
    

}
