package ua.pp.krotov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Victor on 04.11.2016.
 */
public class MainClass {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test // Marking this method as part of the test
    public void gotoBayramixPage() {

        driver.get("http://www.bayramix.com.ua/");
    }
}
