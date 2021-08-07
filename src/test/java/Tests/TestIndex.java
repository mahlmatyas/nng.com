package Tests;

import General.Constans;
import Pages.Index;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIndex extends TestEnvironment {

    @Test
    public void TestIndex(){

        index = new Index(driver);
        index.contactUrlClick();

        Assertions.assertEquals(Constans.CONTACT_US_LANDING_URL, driver.getCurrentUrl());
        Assertions.assertTrue(driver.getPageSource().contains("f__label"));
    }
}
