package General;

import org.openqa.selenium.By;

public class Constans {

    public static final String URL_BASE = "https://www.nng.com/";

    //index page
    public static final By CONTACT_MENU = By.xpath("//*[@id=\"menu-item-63\"]");
    public static final By CONTACT_US = By.xpath("//*[@id=\"menu-item-65\"]/a");
    public static final By INDEX_COOKIE = By.id("onetrust-accept-btn-handler");

    //contact page
    public static final String CONTACT_US_LANDING_URL = "https://www.nng.com/contact-us/";
    public static final By CONTACT_US_CAPTCHA = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
    public static final By CONTACT_US_FULLNAME = By.xpath("//*[contains(@name,'fullname')]"); // [@id="contact-form"]/div[2]/input
    public static final String CONTACT_US_FULLNAME_CONTENT = "Gipsz Jakab";
    public static final By CONTACT_US_TEXTAREA= By.xpath("//*[@id=\"contact-form\"]/div[8]/textarea");
    public static final By CONTACT_US_COPIED_CONTENT_TO_TEXTAREA = By.xpath("/html/body/main/div/div[1]/p[2]");
}