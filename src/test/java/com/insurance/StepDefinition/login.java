package com.insurance.StepDefinition;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.insurance.BaseClass.Base;
import com.insurance.PageObjectModel.Lifeinsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends Base{
	Lifeinsurance Locators = new Lifeinsurance();
	Base baseclass = new Base();
	
	
	@Given("user launches the Application {string}")
	public void user_launches_the_application(String url) {
    try{
		baseclass.appLaunch(url);}
	catch(Exception e) {
	e.printStackTrace();}
	}

	@When("user clicks product option")
	public void user_clicks_product_option() {
		try {
		baseclass.mouseOver(Locators.getBtn());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}
		
	@Then("user click insurance plan option")
	public void user_click_insurance_plan_option() {
		try {
		baseclass.mouseOver(Locators.getInsurance());
		}
	catch(Exception e) {
		e.printStackTrace();}
}

	@Then("user click endownment button")
	public void user_click_endownment_button() {
		try {
		baseclass.button(Locators.getEndown());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select the LIC Single Premium Endowment Plan")
	public void user_select_the_lic_single_premium_endowment_plan() {
		try {
		baseclass.button(Locators.getPlan());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user choose sales brochure")
	public void user_choose_sales_brochure() {
		try {
		baseclass.button(Locators.getSales());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}
	@When("user choose a product button")
	public void user_choose_a_product_button() {
		try {
		baseclass.mouseOver(Locators.getButton());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select insurance plan")
	public void user_select_insurance_plan() {
		try {
		baseclass.mouseOver(Locators.getInsur());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user click endownment plan option")
	public void user_click_endownment_plan_option() {
		try {
		baseclass.button(Locators.getEndownment());

	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select the LIC new Endownment Plan")
	public void user_select_the_lic_new_endownment_plan() {
		try {
		baseclass.button(Locators.getEnbtn());

	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select Policy document")
	public void user_select_policy_document() {
		try {
		baseclass.button(Locators.getPolicy());

	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@When("user select product option")
	public void user_select_product_option() {
		try {
		baseclass.mouseOver(Locators.getChoose());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user click Unit Linked plan button")
	public void user_click_unit_linked_plan_button() {
		try {
		baseclass.button(Locators.getUnit());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user click LIC Nivesh plan")
	public void user_click_lic_nivesh_plan() {
		try {
		baseclass.button(Locators.getNivesh());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select sales brochure from UNit Linked Plan")
	public void user_select_sales_brochure_from_u_nit_linked_plan() {
		try {
		baseclass.button(Locators.getSelectsales());
		}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@When("user click the product button")
	public void user_click_the_product_button() {
		try {
		baseclass.mouseOver(Locators.getBtn());
	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user clicks term insurance plan")
	public void user_clicks_term_insurance_plan() {
		try {
		baseclass.mouseOver(Locators.getInsur());
	}
		catch(Exception e) {
			e.printStackTrace();}
	}
	@Then("user selcts the term assurance plan")
	public void user_selcts_the_term_assurance_plan() {
		try {
	    baseclass.button(Locators.getAssurance());
	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("click LIC Digi term plan")
	public void click_lic_digi_term_plan() {
		try {
		 baseclass.button(Locators.getDigi());
	}
		catch(Exception e) {
			e.printStackTrace();}
	}

	@Then("user select the sales brochure")
	public void user_select_the_sales_brochure() {
		try {
		baseclass.button(Locators.getBrochure());
	}
		catch(Exception e) {
			e.printStackTrace();}
	}




	



}
