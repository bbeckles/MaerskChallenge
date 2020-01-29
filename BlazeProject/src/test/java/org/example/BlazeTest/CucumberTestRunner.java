package org.example.BlazeTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty"},
        features = "/Users/tcadmin/IdeaProjects/BlazeProject/src/test/resources/Features",
        glue = "org.example.StepDefs")
public class CucumberTestRunner {
}
