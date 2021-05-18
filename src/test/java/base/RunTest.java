package base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/1_task.feature"},
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber-report.json"}
)
public class RunTest {
}