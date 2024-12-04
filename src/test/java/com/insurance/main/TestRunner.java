package com.insurance.main;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Feature\\login.feature", 
				  glue="com.insurance.StepDefinition", 
				  dryRun=false,
				  monochrome=true,
				  
				  plugin = {"html:target/html","json:target/report.json"}
				  )

				 
public class TestRunner {


}
 