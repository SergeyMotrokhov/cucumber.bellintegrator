package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.ServicePage;

public class TestBase {
    protected ChromeDriver driver;
    protected MainPage mainPage;
    protected ServicePage servicePage;

    public void start() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1920,1080");
        ChromeDriverService chromeDriverService = ChromeDriverService.createDefaultService();
        driver = new ChromeDriver(chromeDriverService, options);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        servicePage = PageFactory.initElements(driver, ServicePage.class);

    }


    protected void finish() {
        if (driver != null) {
            driver.quit();
        }
    }

}
