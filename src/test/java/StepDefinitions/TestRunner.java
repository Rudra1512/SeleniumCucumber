package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/ddts.feature", glue = {"StepDefinitions"},
plugin = {"pretty", "html:target/HTMLReports/index.html",
        "pretty", "json:target/JSONReports/report.json",
"pretty", "junit:target/JUnitReports/report.xml"})
public class TestRunner {
}
