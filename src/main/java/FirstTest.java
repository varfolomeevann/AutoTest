import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "d:\\наташа it step\\java\\Automatization\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	WebDriverWait wait = new WebDriverWait(driver, null, null, 0, 0);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://music.yandex.by");
//	driver.findElement(By.name("q")).sendKeys("Шаг" + Keys.ENTER);;
//	driver.findElement(By.xpath(//*[@id=\"tads\"]/div/ol/li/div[1])).click();
//	driver.findElements(By.xpath("//*[@id=\"tads\"]/div/ol/li/div[1]")).size();
	driver.findElement(By.className("button__label")).click();
	driver.quit();
    }

}
