package com.test.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumberreports/cucumber.html",
							"json:target/cucumber-reports/cucumber.json"},
			features = {"src/test/resources/SalesForceLogin.feature"},
			glue = {"com.tests"},
			dryRun = false,
			monochrome =true
			//tags = "@Smoke  or @regression"  // or = all TC executes  // and both TC executed	
)
public class Runner extends AbstractTestNGCucumberTests {
	
}
