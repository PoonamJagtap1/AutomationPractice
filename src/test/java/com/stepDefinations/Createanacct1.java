package com.stepDefinations;

import com.stepDefinations.Driverclass;
import com.stepDefinations.pages.Createanacct1_page;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_old.Ac;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Createanacct1 extends Driverclass {
    public Createanacct1_page C_page= PageFactory.initElements(driver,Createanacct1_page.class);
    @When("^I click on SignIn button of Automation Practice Website$")
    public void iClickOnSignInButtonOfAutomationPracticeWebsite() {
        int SignInButton = driver.findElements(By.linkText("Sign in")).size();
//        Assert.assertEquals(1,SignInButton);
//boolean buttonDisplayed = driver.findElement(By.linkText("Sign in")).isDisplayed();
//Assert.assertTrue(buttonDisplayed);
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Then("^Create_an_Account form should open\"([^\"]*)\"$")
    public void create_an_accountFormShouldOpen(String Expected_Results) {
        String Actual_Results = driver.getCurrentUrl();
        Assert.assertEquals(Expected_Results, Actual_Results);

    }

    @And("^I enter Email address\"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        String timestamp = new SimpleDateFormat("yy.MM.dd.HH.MM.SS").format(new Date());
        String Emailid_i[] = email.split("@");
        String Emailid_2 = Emailid_i[0] + timestamp + "@" + Emailid_i[1];
        driver.findElement(By.id("email_create")).sendKeys(Emailid_2);
    }

    @And("^click on Create_an_account button$")
    public void clickOnCreate_an_accountButton() {
        driver.findElement(By.id("SubmitCreate")).click();

    }

        @And("^I select the \"([^\"]*)\" as Mr or Mrs$")
    public void iSelectTheAsMrOrMrs(String Title) {
//        if (Title.equalsIgnoreCase("Mr")){
//            driver.findElement(By.id("id_gender1")).click();
//        }else {
//            driver.findElement(By.id("uniform-id_gender2")).click();
        }


    @And("^enter below details:$")
    public void enterBelowDetails(DataTable table) {

//        System.out.println(table.getGherkinRows().get(0).getCells().get(0));
//        System.out.println(table.getGherkinRows().get(0).getCells().get(1));
//        System.out.println(table.getGherkinRows().get(0).getCells().get(2));
//        System.out.println(table.getGherkinRows().get(0).getCells().get(3));
//        System.out.println(table.getGherkinRows().get(0).getCells().get(4));
        C_page.enterFirstname(table.getGherkinRows().get(1).getCells().get(0));
        C_page.enterLastname(table.getGherkinRows().get(1).getCells().get(1));
        C_page.enterEmailid(table.getGherkinRows().get(1).getCells().get(2));
        C_page.enterPassword(table.getGherkinRows().get(1).getCells().get(3));
        C_page.enterDay(table.getGherkinRows().get(1).getCells().get(4));
        C_page.enterMonth(table.getGherkinRows().get(1).getCells().get(5));
        C_page.enterYear(table.getGherkinRows().get(1).getCells().get(6));
    }
}

