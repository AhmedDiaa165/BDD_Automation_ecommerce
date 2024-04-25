package Runer;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features ="src/main/resources/Features",
        glue = {"StepDef"},
        tags = "@regression",
        plugin = {"pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        }

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
