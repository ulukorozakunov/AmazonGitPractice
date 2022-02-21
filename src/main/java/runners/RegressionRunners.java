package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/java/resources/features",
        glue = "step_defs",
        tags ="@Smoke & @Regression",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        publish = true
)
public class RegressionRunners {
}