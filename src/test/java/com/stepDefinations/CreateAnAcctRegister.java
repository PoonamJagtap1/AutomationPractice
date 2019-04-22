package com.stepDefinations;

import com.stepDefinations.Driverclass;
import com.stepDefinations.pages.CreateAnAcctRegister_page;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class CreateAnAcctRegister extends Driverclass{
    public CreateAnAcctRegister_page A_page= PageFactory.initElements(driver,CreateAnAcctRegister_page.class);
//    WebDriverWait wait = new WebDriverWait(driver,60);

    @When("^I click on signin button of Automation Practice website$")
    public void iClickOnSigninButtonOfAutomationPracticeWebsite() {
        A_page.click_on_sign_in_button();

    }


    @And("^I click on enter your email address as \"([^\"]*)\"$")
    public void iClickOnEnterYourEmailAddressAs(String emailId) {

        String timestamp = new SimpleDateFormat("yy.MM.dd.HH.MM.SS").format(new Date());
        String emailid_i[] = emailId.split("@");
        String emailid_2 = emailid_i[0] + timestamp + "@" + emailid_i[1];

    }

    @And("^I enter password as \"([^\"]*)\" in password field$")
    public void iEnterPasswordAsInPasswordField(String password)  {


    }

    @And("^I should go to \"([^\"]*)\" form$")
    public void iShouldGoToForm(String form){
        driver.findElement(By.id("page"));
    }

    @When("^I click Sign_in button on Register page of the form$")
    public void iClickSign_inButtonOnRegisterPageOfTheForm() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I should see My Account page\"([^\"]*)\"$")
    public void iShouldSeeMyAccountPage(String Expected_Result){
        String Actual_Result = driver.getCurrentUrl();
        Assert.assertEquals(Expected_Result,Actual_Result);

    }

    @And("^I enter below details:$")
    public void iEnterBelowDetails(DataTable table) {
//        System.out.println(table.getGherkinRows().get(0).getCells().get(0));
//        System.out.println(table.getGherkinRows().get(1).getCells().get(0));
//        System.out.println(table.getGherkinRows().get(1).getCells().get(1));
        A_page.enterEmailaddress(table.getGherkinRows().get(1).getCells().get(0));
        A_page.enterpassword(table.getGherkinRows().get(1).getCells().get(1));
    }
}
