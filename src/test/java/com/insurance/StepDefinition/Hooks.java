package com.insurance.StepDefinition;

import com.insurance.BaseClass.Base;

import io.cucumber.java.Before;

public class Hooks extends Base{
Base b = new Base();

@Before
public void method() {
	b.launchBrowser();
}
	
	
}
