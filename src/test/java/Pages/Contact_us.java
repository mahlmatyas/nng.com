package Pages;

import General.Constans;
import org.openqa.selenium.WebDriver;

public class Contact_us {

    //properties
    private WebDriver driver;

    //constructor
    public Contact_us(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void fillContactForm(String fullname, String textarea){
        driver.findElement(Constans.CONTACT_US_FULLNAME).sendKeys(fullname);
        driver.findElement(Constans.CONTACT_US_TEXTAREA).sendKeys(textarea);
        //driver.findElement(Constans.CONTACT_US_CAPTCHA).isSelected();
    }
}