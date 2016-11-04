package ua.pp.krotov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * Created by Victor on 04.11.2016.
 */
public class Menubar extends StartPage {
    public Menubar (WebDriver driver) {
        super (driver);
    }
    public WebDriver driver;

    //menuBar

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1 active current']")
    public WebElement aboutCompany;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/frontpage/bayramix.html']")
    public WebElement products;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/price.html']]")
    public WebElement priceList;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/kontakty.html']")
    public WebElement contacts;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/forum']")
    public WebElement forum;
}
