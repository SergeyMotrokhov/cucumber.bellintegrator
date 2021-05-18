package steps;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.PropFileRead;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepDefs extends TestBase {
    private static final Logger LOG = LoggerFactory.getLogger(StepDefs.class);

    @Before
    public void start(Scenario scenario) {
        super.start();
        LOG.info("Scenario " + scenario.getName() + " is started.");
    }

    @Given("^I go to test site$")
    public void iGoToTestSite() {
        driver.get(new PropFileRead().getProp("url"));
    }

    //@Then("тайтл равен '(.*)'")
    @Then("^Check title equals '(.*)'$")
    public void тайтлРавенBellIntegrator(String checkTitle) {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains(checkTitle));
    }

    @When("^I click Top Menu$")
    public void clickTopMenuMainPage() {
        mainPage.clickTopMenu();
    }

    @And("^I choose service '(.*)'$")
    public void clickService(String service) {
        mainPage.clickChoosenService(service);
    }

    @Then("^Check header equals '(.*)'$")
    public void assertionServiceHeader(String service) {
        Assert.assertEquals(service, servicePage.getServiceHeader());
    }


    @After
    public void finish() {
        super.finish();
    }
}
