package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;  // Import the correct
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) // Ensure Cucumber is properly imported here
@CucumberOptions(
        features = {".//Features/testautomationpractice.feature"},  // Path to feature file
        glue = "StepDefinition",  // Package where step definitions are located
        tags="@abcd",
        
        dryRun = false,  // If true, only checks if the steps are defined, without running them
        monochrome = true,  // Makes the console output more readable
        plugin = {"pretty","html:target/cucumber-report/reports1.html"}  // Pretty print output
)
public class Run {
    
}

