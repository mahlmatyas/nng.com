package Pages;

import General.Constans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Index {

    //properties
    private WebDriver driver;

    //constructor
    public Index(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void contactUrlClick() {
        driver.findElement(Constans.CONTACT_MENU).click();
        driver.findElement(Constans.CONTACT_US).click();
    }
}