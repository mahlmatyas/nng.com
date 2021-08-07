package Tests;

import General.Constans;
import General.Methods;
import Pages.Contact_us;
import Pages.Index;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContact_us extends TestEnvironment {

    private Contact_us contact_us;

    @Test
    public void Test_Contact_us() {
        index = new Index(driver);
        Methods.TakeScreenshot(driver);
        index.contactUrlClick();

        contact_us = new Contact_us(driver);
        Methods.TakeScreenshot(driver);
        contact_us.fillContactForm(
                Constans.CONTACT_US_FULLNAME_CONTENT,
                driver.findElement(Constans.CONTACT_US_COPIED_CONTENT_TO_TEXTAREA).getText());

        /*
        String expectedName =     driver.findElement(Constans.CONTACT_US_FULLNAME).getText();
        String expectedTextarea = driver.findElement(Constans.CONTACT_US_TEXTAREA).getText();

        System.out.println("elso: "+expectedName);
        System.out.println("masodik: "+expectedTextarea);

        Assertions.assertTrue(expectedName.contains("Gipsz"),"Error_1");
        Assertions.assertTrue(expectedTextarea.contains("contact form below"),"Error_2");
        */

        Assertions.assertTrue(driver.getPageSource().contains("contact form below"));
    }
}