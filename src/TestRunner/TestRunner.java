package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"StepDef"}
		,dryRun=false
		,tags = "@TestCase-one,@TestCase-two"
		,plugin = {"pretty" ,/*"html:target/cucumber-html-report",*/ "json:target/cucumber-json-report.json", "junit:target/cucumber-junit-report.xml"}
		)

public class TestRunner {
	
}
