package TestEnvironment;

import General.Constans;
import Pages.Index;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestEnvironment {

    //properties
    protected WebDriver driver;
    protected Index index;

    @BeforeEach
    public void SetUp(){
        WebDriverManager.chromedriver().setup(); //System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        //options.addArguments("--incognito");
        options.addArguments("--headless"); // github action-nál át kell állítanom
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Constans.URL_BASE);
        driver.manage().window().setSize(new Dimension(1920,1080));
    }

    @AfterEach
    public void TearDown(){
        driver.quit();
    }
}
