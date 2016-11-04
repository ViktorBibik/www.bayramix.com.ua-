package ua.pp.krotov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Victor on 04.11.2016.
 */
public class Contacts extends StartPage {
    public Contacts (WebDriver driver) {
        super (driver);
    }

    // contacts

    @FindBy(xpath = "//div[@class='item']//h2[@class='subtitle']")
    public WebElement companyName;

    @FindBy(xpath = "//div[@class='address']//ul[@class='blank']")
    public WebElement companyAdress;

    @FindBy(xpath = "//div[@class='contact']//ul[@class='blank']")
    public WebElement companyContacts;
}
