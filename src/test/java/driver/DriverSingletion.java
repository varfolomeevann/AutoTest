package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingletion {
    private static WebDriver driver;

    private DriverSingletion() {
    }
    public static WebDriver getDriver() {
	if (driver == null) {
	    driver = new ChromeDriver();
	}
	return driver;

    }
    public static void closeDriver() {
	if (driver != null) {
	    driver.quit();
	    driver = null;
	}
    }
}
