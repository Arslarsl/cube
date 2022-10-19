package com.testCases;
import org.junit.Test;
import org.testng.Assert;
import com.pageObjects.CreateApp;



public class CreateAppTestcase extends BaseClass{

    CreateApp capp =new CreateApp(driver);

@Test

public void CreateApp() throws InterruptedException
{
    driver.get(baseURL);  
    //Assert.assertEquals(capp.applytext().getText(), "Apply in 1 Minute");

    if (driver.getTitle().equals("Apply Now – Cubefunder"))
    {
        Assert.assertTrue(true);  
    }
    else
    {
        Assert.assertTrue(false); 
    }
   capp.cookie();
   Thread.sleep(3000);
   capp.main_contact_title();
   capp.full_name(full_name);
   capp.email(email);
   capp.mobile(mobile);
   Thread.sleep(3000);
   capp.dob(dob);
   capp.iseCommerce();
   capp.businesssector();
   capp.monthly_revenue();
   capp.business_type();
   capp.loan_amount();
   capp.loan_term();
   capp.company_role();
   capp.noofbankaccounts();  
   capp.bank_name(bank); 
   capp.business_name(businessname);
   Thread.sleep(3000);
   capp.btncompanyhouse();
   Thread.sleep(3000);
   capp.companies();
   Thread.sleep(3000);
   capp.checkbox1();
   Thread.sleep(3000);
   capp.checkbox2();

   


}


}


