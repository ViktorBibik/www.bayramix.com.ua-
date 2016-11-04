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
    public WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void gotoBayramixPage() {

        driver.get("http://www.bayramix.com.ua/");

        //driver.findElement(By.xpath("//nav[@id='menu']//a[@class='level1' and @href='/kontakty.html']")).click();

        Contacts page = new Contacts(driver);
        Menubar menubar = new Menubar(driver);

        menubar.contacts.click();

        //String companyName = page.companyName.getText();
        //String companyAdress = page.companyAdress.getText();
        //String companyContacts = page.companyContacts.getText();

        //System.out.println("Компания: " + page.companyName.getText());
        //System.out.println("Адресс: " + page.companyAdress.getText());
        //System.out.println("Контакты : " + page.companyContacts.getText());
    }
}
