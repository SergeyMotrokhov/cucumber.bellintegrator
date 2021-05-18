package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServicePage {
    public ServicePage servicePage;
    private WebDriver driver;

    public ServicePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//h2[@class='head-title_text title-left']")
    WebElement header;

    public String getServiceHeader(){
        return header.getText();
    }


}
