package test;

import org.testng.annotations.AfterMethod;

import driver.DriverSingletion;

public class BaseTest {
    
    @AfterMethod
    public void tearDown() {
	DriverSingletion.closeDriver();
    }
   
}
