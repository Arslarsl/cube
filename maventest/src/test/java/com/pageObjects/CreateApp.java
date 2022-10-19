package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateApp {

    WebDriver ldriver;
//Constructor defination
public CreateApp(WebDriver rdriver) {
 
    ldriver=rdriver;
    PageFactory.initElements(rdriver,this);
}
//Now define the Locators

@FindBy(xpath ="//*[@id='cf_gdpr_msg1_link']")
@CacheLookup
WebElement cookie;

@FindBy(name="feedform[main_contact_title]")
@CacheLookup
WebElement main_contact_title;

@FindBy(id="fld_full_name")
@CacheLookup
WebElement full_name;

@FindBy(name="feedform[email]")
@CacheLookup
WebElement email;

@FindBy(name="feedform[mobile]")
@CacheLookup
WebElement mobile;

@FindBy(name="feedform[dob]")
@CacheLookup
WebElement dob;

@FindBy(name="feedform[iseCommerce]")
@CacheLookup
WebElement iseCommerce;

@FindBy(name="feedform[businesssector]")
@CacheLookup
WebElement businesssector;

@FindBy(name="feedform[monthly_revenue]")
@CacheLookup
WebElement monthly_revenue;

@FindBy(name="feedform[business_type]")
@CacheLookup
WebElement business_type;

@FindBy(name="feedform[loan_amount]")
@CacheLookup
WebElement loan_amount;

@FindBy(name="feedform[loan_term]")
@CacheLookup
WebElement loan_term;

@FindBy(name="feedform[company_role]")
@CacheLookup
WebElement company_role;

@FindBy(name="feedform[noofbankaccounts]")
@CacheLookup
WebElement noofbankaccounts;

@FindBy(name="feedform[bank_name]")
@CacheLookup
WebElement bank_name;


@FindBy(name="feedform[business_name]")
@CacheLookup
WebElement business_name;


@FindBy(id="btncompanyhouse_lookup")
@CacheLookup
WebElement btncompanyhouse;

@FindBy(xpath ="//*[@id='companies-list']/div/div/div[1]")
@CacheLookup
WebElement companies;

@FindBy(xpath ="//*[@id='feedform_form']/div/div[29]/label/span[1]")
@CacheLookup
WebElement checkbox1;

@FindBy(xpath ="//*[@id='main_consent_box']/div/label/span[1]")
@CacheLookup
WebElement checkbox2;





//action methods
public void cookie()
{
    cookie.click();
}
public void main_contact_title()
{
    Select selectobj= new Select(main_contact_title); 
    selectobj.selectByIndex(2);
}

public void full_name(String fulname)
{
    full_name.sendKeys(fulname);
}
public void email(String cemail)
{
    email.sendKeys(cemail);
}
public void mobile(String cmobile)
{
    mobile.sendKeys(cmobile);
}
public void dob(String cdob)
{
    dob.sendKeys(cdob);
}
public void iseCommerce()
{
    Select selectobj= new Select(iseCommerce); 
    selectobj.selectByIndex(2);
}
public void businesssector()
{
    Select selectobj= new Select(businesssector); 
    selectobj.selectByIndex(2);
}
public void monthly_revenue()
{
    Select selectobj= new Select(monthly_revenue); 
    selectobj.selectByIndex(2);
}
public void business_type()
{
    Select selectobj= new Select(business_type); 
    selectobj.selectByIndex(2);
}
public void loan_amount()
{
    Select selectobj= new Select(loan_amount); 
    selectobj.selectByIndex(2);
}
public void loan_term()
{
    Select selectobj= new Select(loan_term); 
    selectobj.selectByIndex(2);
}
public void company_role()
{
    Select selectobj= new Select(company_role); 
    selectobj.selectByIndex(2);
}
public void noofbankaccounts()
{
    Select selectobj= new Select(noofbankaccounts); 
    selectobj.selectByIndex(1);
}
public void bank_name(String cbank_name)
{
    bank_name.sendKeys(cbank_name);
}
public void business_name(String cbusiness_name)
{
    business_name.sendKeys(cbusiness_name);
}
public void btncompanyhouse()
{
    btncompanyhouse.click();
}
public void companies()
{
    companies.click();
}
public void checkbox1()
{
    checkbox1.click();
}
public void checkbox2()
{
    checkbox2.click();
}

}
