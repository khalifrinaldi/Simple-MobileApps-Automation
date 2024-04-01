package data.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"data"},
        format = {"pretty","html:target/results/reports"},
        tags = {"@test"}
)
public class SampleTest {
}
