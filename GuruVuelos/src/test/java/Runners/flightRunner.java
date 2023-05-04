package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flight.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "StepDefinitions"
)
public class flightRunner {
}
