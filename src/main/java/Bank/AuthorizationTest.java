package Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorizationTest{
    public static void main(String[] args) throws InterruptedException {
	//validData();
//	Thread.sleep(1000);
//	emptyFields();
//	Thread.sleep(1000);
//	fieldLoginEmpty();
    }
        
    public static void validData() {
//	System.setProperty("webdriver.chrome.driver", "d:\\������ it step\\java\\Automatization\\src\\main"
//		+ "\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	WebDriverWait wait = new WebDriverWait(driver, null, null, 0, 0);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
		+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("username")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("demo");;
	driver.findElement(By.id("login-button")).click();
	driver.quit();
	
    }
    public static void emptyFields() {
   	System.setProperty("webdriver.chrome.driver", "d:\\������ it step\\java\\Automatization\\src\\main"
   		+ "\\resources\\chromedriver.exe");
   	WebDriver driver = new ChromeDriver();
   	driver.manage().window().maximize();
   	
   	driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
   		+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
   	driver.findElement(By.name("username")).clear();
   	driver.findElement(By.name("password")).clear();
   	driver.findElement(By.id("login-button")).click();
   	driver.quit();
   	
       }
    public static void fieldLoginEmpty() {
   	System.setProperty("webdriver.chrome.driver", "d:\\������ it step\\java\\Automatization\\src\\main"
   		+ "\\resources\\chromedriver.exe");
   	WebDriver driver = new ChromeDriver();
   	driver.manage().window().maximize();
   	/*
   	 * ������� ����������
   	 */
   	driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
   		+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
   	/*
   	 * �������� ���� ����� � ������
   	 */
   	driver.findElement(By.name("username")).clear();
   	driver.findElement(By.name("password")).clear();
   	/*
   	 * ���� ����� �������� ������
   	 * � ���� ������ ������ �������� ������
   	 */
   	driver.findElement(By.name("password")).sendKeys("demo");
   	/*
   	 * ������ ������ "�����"
   	 */
   	driver.findElement(By.id("login-button")).click();
   	driver.quit();
   	
       }
}
