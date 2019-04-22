package com.stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class SigninDefinition extends Driverclass {


    @Given("^I goto url \"([^\"]*)\"$")
    public void iGotoUrl(String URL) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Downloads\\googlechrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @When("^I click Login Link on Home Page$")
    public void iClickLoginLinkOnHomePage() {
        driver.findElement(By.linkText("Login"));
    }


    @Given("^I click login button on Home Page$")
    public void iClickLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }


    @Given("^I enter user name as \"([^\"]*)\"$")
    public void iEnterUserNameAs(String userName) {
        driver.findElement(By.name("log")).sendKeys(userName);
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
    }

    @When("^I click login button on the login page$")
    public void iClickLoginButtonOnTheLoginPage() {
        driver.findElement(By.name("submit")).click();

    }


    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String expected_errorMessage) {
        String actual_errorMessage;
        actual_errorMessage = driver.findElement(By.xpath("//*[@id=\"post-4521\"]/div/div[1]")).getText();

//        System.out.println("expected_errorMessage=====>" + expected_errorMessage);
//        System.out.println("actual_errorMessage=======>" + actual_errorMessage);

        assertEquals(expected_errorMessage, actual_errorMessage);
    }

//    stepDefinations for Register Button.
    @When("^I click Register Link on Home Page$")
    public void iClickRegisterLinkOnHomePage() {
        driver.findElement(By.linkText("Register")).click();
    }


    @Then("^I should see the url as \"([^\"]*)\"$")
    public void iShouldSeeTheUrlAs(String expectedurl) {
        String actualurl;
        actualurl = driver.getCurrentUrl();
        Assert.assertEquals(expectedurl, actualurl);
    }

    @Given("^I enter the first name as \"([^\"]*)\"$")
    public void iEnterTheFirstNameAs(String firstName) {
        driver.findElement(By.name("first_name")).click();
    }

    @Given("^I enter the last name as \"([^\"]*)\"$")
    public void iEnterTheLastNameAs(String lastName) {
        driver.findElement(By.name("last_name")).click();
    }

//    @Given("^I enter email id as \"([^\"]*)\"$")
//    public void iEnterEmailIdAs(String emailId) {
//        split emailid string value to string array with common expression"@"
//        String emailId_i[] = emailId.split("@");
//Declare & initialisation or instance or object
//        String timestamp = new SimpleDateFormat("yy.MM.dd.HH24.MM.SS").format(new Date());
//        System.out.println(timestamp);
//        String emailid_2 = emailId_i[0] + timestamp + "@" + emailId_i[1];
//        System.out.println(emailid_2);
//        driver.findElement(By.name("email")).click();
//    }


    @Given("^I enter the confirm password as \"([^\"]*)\"$")
    public void iEnterTheConfirmPasswordAs(String confirmPassword) {
        driver.findElement(By.name("pass2")).click();
    }

    @When("^I click Register button on Register page$")
    public void iClickRegisterButtonOnRegisterPage() {
        driver.findElement(By.name("btn-submit")).click();
    }

    @Then("^I should see My Account page as \"([^\"]*)\"$")
    public void iShouldSeeMyAccountPageAs(String expected_results) {
        String actual_results;
        actual_results = driver.findElement(By.linkText("My Account")).getText();
        Assert.assertEquals(expected_results, actual_results);


    }

//    @Given("^I enter Email Address as \"([^\"]*)\"$")
//    public void iEnterEmailAddressAs(String emailid){
//        String emailid_i[]= emailid.split("@");
//        String timestamp = new SimpleDateFormat("yy.MM.dd.HH24.MM.SS").format(new Date());
//        System.out.println(timestamp);
//        String emailid_2 = emailid_i[0] + timestamp + "@" + emailid_i[1];
//        System.out.println(emailid_2);
//        driver.findElement(By.id("email")).click();
//    }
//DO WE WRITE THIS CONDITION
    @Given("^I select \"([^\"]*)\" from Subject Heading$")
    public void iSelectFromSubjectHeading(String Subject_Heading){
        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(1);
    }

    @Given("^I enter Message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String Message){
        driver.findElement(By.id("message")).sendKeys(Message);
    }
//HOW TO WRITE THIS SD
//    @Given("^I enter invalid Email Address as \"([^\"]*)\"$")
//    public void iEnterInvalidEmailAddressAs(String invalid_emailid){


//    }

        @When("^I click on contact us button$")
        public void iClickOnContactUsButton() {

            driver.findElement(By.linkText("Contact us")).click();
        }



//        @Given("^Order Reference as\"([^\"]*)\"$")
//        public void orderReferenceAs(String Order_Reference) {
//
//            driver.findElement(By.id("id_order")).click();
//        }

        @Then("^press send button and I should receive a message \"([^\"]*)\"$")
        public void pressSendButtonAndIShouldReceiveAMessage(String send_button) {
            driver.findElement(By.id("submitMessage")).click();
        }

    @Given("^Order Reference as\"([^\"]*)\"$")
    public void orderReferenceAs(String Order_Reference)  {
        driver.findElement(By.id("id_order")).sendKeys(Order_Reference);

    }
}






