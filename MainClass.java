package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Victor on 04.11.2016.
 */
public class MainClass {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void gotoBayramixPage() {

        driver.get("http://www.bayramix.com.ua/");

        Contacts page = new Contacts(driver);

        String companyName = page.companyName.getText();
        String companyAdress = page.companyAdress.getText();
        String companyContacts = page.companyContacts.getText();

        System.out.println("Компания: " + companyName);
        System.out.println("Адресс: " + companyAdress);
        System.out.println("Контакты : " + companyContacts);
        //page.companyName.getText();
        //page.companyAdress.getText();
        //page.companyContacts.getText();
    }
}
