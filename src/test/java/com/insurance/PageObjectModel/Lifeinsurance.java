package com.insurance.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.BaseClass.Base;

public class Lifeinsurance extends Base{
	
	// Constructor to initialize elements using PageFactory
   public Lifeinsurance() {
   	PageFactory.initElements(driver, this);
    }
   
   

@FindBy(xpath="//a[@title='Products']")
   private WebElement btn;
   
   @FindBy(xpath=" //a[text()='Insurance Plans'] ")
   private WebElement insurance;
   
   @FindBy(xpath="//a[@title='Endowment Plans']")
   private WebElement endown;
   
   @FindBy(xpath="//a[@href='/en/web/guest/lic-s-single-premium-endowment-plan-717-512n283v03']")
   private WebElement plan;
   
   @FindBy(xpath="//a[text()=' Sales Brochure ']")
   private WebElement sales;
   
   @FindBy(xpath="//a[@title='Products']")
   private WebElement button;
   
   @FindBy(xpath=" //a[text()='Insurance Plans'] ")
   private WebElement insur;
   
   @FindBy(xpath="//a[@title='Endowment Plans']")
   private WebElement endownment;
   
   @FindBy(xpath="//a[@href='/en/web/guest/lic-s-new-endowment-plan-714-512n277v03']")
   private WebElement enbtn;
   
   @FindBy(xpath=" //a[text()=' Sales brochure '] ")
   private WebElement policy;
   
   @FindBy(xpath="//a[@title='Products']")
   private WebElement choose;
   
   @FindBy(xpath="//a[@title='Unit Linked Plans']")
   private WebElement unit;
   
   
   @FindBy(xpath="//a[@href='/en/web/guest/lic-s-index-plus-873-512l354v01']")
   private WebElement nivesh;
   
   @FindBy(xpath=" //a[text()=' Sales Brochures ']")
   private WebElement selectsales;
   
   @FindBy(xpath="//a[@title='Products']")
   private WebElement button1;
   
   @FindBy(xpath=" //a[text()='Insurance Plans'] ")
   private WebElement insure;
   
   @FindBy(xpath="//a[text()='Term Assurance Plans']")
   private WebElement assurance;
   
   @FindBy(xpath="//a[@href='/en/web/guest/lic-s-digi-term-876-512n356v01']")
   private WebElement digi;
   
   @FindBy(xpath="//a[text()=' Sales Brochure ']")
   private WebElement brochure;

public WebElement getBtn() {
	return btn;
}

public WebElement getInsurance() {
	return insurance;
}

public WebElement getEndown() {
	return endown;
}

public WebElement getPlan() {
	return plan;
}

public WebElement getSales() {
	return sales;
}

public WebElement getButton() {
	return button;
}

public WebElement getInsur() {
	return insur;
}

public WebElement getEndownment() {
	return endownment;
}

public WebElement getEnbtn() {
	return enbtn;
}

public WebElement getPolicy() {
	return policy;
}

public WebElement getChoose() {
	return choose;
}

public WebElement getUnit() {
	return unit;
}

public WebElement getNivesh() {
	return nivesh;
}

public WebElement getSelectsales() {
	return selectsales;
}

public WebElement getButton1() {
	return button1;
}

public WebElement getInsure() {
	return insure;
}

public WebElement getAssurance() {
	return assurance;
}

public WebElement getDigi() {
	return digi;
}

public WebElement getBrochure() {
	return brochure;
}


   
   
  
    
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-------------------------------------------------------------------Life Insurance---------------------------------------------------------------- 
//    
//    @FindBy(xpath="//span[text()='Insurance']")
//    private WebElement insuranceOption;
//    
//    @FindBy(xpath="//a[@href='/life/' and @class='full-link']")
//    private WebElement LifeInsuranceBtn;
    
////-------------------------------------------------------------------- Life Insurance Quotes---------------------------------------------------------------- 
//    
//    @FindBy(xpath="//a[text()=\"Start comparing\"]")
//    private WebElement ClickCompare;
//    
//    @FindBy(xpath="//div[text()='Female']")
//    private WebElement gender;
//    
//    @FindBy(id="ember510")
//    private WebElement Age;
//    
//    @FindBy(id="ember521")
//    private WebElement PostalCode;
//    
//    @FindBy(xpath="//span[text()='Select a State']")
//    private WebElement State;
//    
//    @FindBy(xpath="//div[text()='No']")
//    private WebElement Smoke;
//    
//    @FindBy(xpath="//input[@type=\"search\"]")
//    private WebElement Occupation;
//    
//    @FindBy(xpath="//div[@class='checkbox__faux-input']")
//    private WebElement CheckBox;
//    
//    @FindBy(xpath="//a[@class=\"quote-confirm__btn gtm-quote-confirm\"]")
//    private WebElement Compare;
//    
//
//    
// //---------------------------------------------------------------------------------------------------------------------------------------------------------  
//    
//    public 	WebElement insuranceOption()
//    {
//		return insuranceOption;
//    	
//    }
//    public WebElement LifeInsuranceBtn()
//    {
//		return LifeInsuranceBtn;
//    	
//    }
//    public WebElement ClickCompare()
//    {
//		return ClickCompare;
//    	
//    }
//    public WebElement gender()
//    {
//		return gender;
//    	
//    }
//    public WebElement Age()
//    {
//		return Age;
//    	
//    }
//    public WebElement PostalCode()
//    {
//		return PostalCode;
//    	
//    }
//    public WebElement Smoke()
//    {
//		return Smoke;
//    	
//    }
//    public WebElement State()
//    {
//		return State;
//    	
//    }
//    public WebElement Occupation()
//    {
//		return Occupation;
//    	
//    }
//    public WebElement CheckBox()
//    {
//		return CheckBox;
//    	
//    }
//    public WebElement Compare()
//    {
//		return Compare;
//    	
//    }
//    
//    
//    
    
    
    
    
    
    
}
