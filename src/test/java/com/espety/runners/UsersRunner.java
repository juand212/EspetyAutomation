package com.espety.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Users.feature",
        glue = "com.espety",
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
)
public class UsersRunner {
}
