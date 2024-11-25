package com.insurance.main;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\VISHALI\\ practise\\Insurance1\\src\\test\\resources\\Feature\\login.feature", 
				  glue="com.insurance.StepDefinition", 
				  monochrome=true,
				  plugin = {"html:target/html","json:target/report.json"})

				 
public class TestRunner {


}
 