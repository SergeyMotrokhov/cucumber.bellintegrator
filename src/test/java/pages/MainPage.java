package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.String.format;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class MainPage {
    private WebDriver driver;
    private String chooseService = "//a[text()='%s']";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTopMenu() {
        topMenu.click();
    }

    @FindBy(how = How.XPATH, using = ("//*[@id='top-menu']/span"))
    WebElement topMenu;

    public ServicePage clickChoosenService(String service) {
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(
                By.xpath(format(chooseService, service)))).click();
        return new ServicePage(driver);
    }

}
