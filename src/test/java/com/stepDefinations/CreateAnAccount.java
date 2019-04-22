package com.stepDefinations;

import com.stepDefinations.Driverclass;
import com.stepDefinations.pages.CreateAnAccount_page;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateAnAccount<driver> extends Driverclass {
    public CreateAnAccount_page c_page= PageFactory.initElements(driver,CreateAnAccount_page.class);

//    Wait
    WebDriverWait wait = new WebDriverWait(driver,60);

    @When("^I click on signin button on home page$")
    public void iClickOnSigninButtonOnHomePage() {

        driver.findElement(By.linkText("Sign in")).click();
    }

    @Given("^enter the Email Address as \"([^\"]*)\"$")
    public void enterTheEmailAddressAs(String email) {
//        String emailid_i[]= emailid.split("@");
        String timestamp = new SimpleDateFormat("yy.MM.dd.HH.MM.SS").format(new Date());
        String emailid_i[] = email.split("@");
        String emailid_2 = emailid_i[0] + timestamp + "@" + emailid_i[1];
        driver.findElement(By.name("email_create")).sendKeys(emailid_2);
    }


    @Given("^enter firstName as \"([^\"]*)\"$")
    public void enterFirstNameAs(String firstName) {

        c_page.enterFirstname(firstName);
    }

    @Given("^enter LastName as \"([^\"]*)\"$")
    public void enterLastNameAs(String LastName) {

        c_page.enterLastNameAs(LastName);
    }

    @Given("^I enter password to be \"([^\"]*)\"$")
    public void iEnterPasswordToBe(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @Given("^enter your birth_date as (\\d+)$")
    public void enterYourBirth_dateAs(String birth_date) {
        new Select(driver.findElement(By.id("days"))).selectByValue(birth_date);
    }

    @Given("^if you want to receive new_letters please tick \"([^\"]*)\"$")
    public void ifYouWantToReceiveNew_lettersPleaseTick(String new_letters) {
        driver.findElement(By.id("newsletter")).click();
    }

    @Given("^if you want to receive offers please tick \"([^\"]*)\"$")
    public void ifYouWantToReceiveOffersPleaseTick(String offers) {
        driver.findElement(By.id("optin")).click();
    }

    @Given("^I enter Create an account button$")
    public void iEnterCreateAnAccountButton() {
        driver.findElement(By.name("SubmitCreate")).click();

   }

    @Given("^I select Title as \"([^\"]*)\" on your personal information form$")
    public void iSelectTitleAsOnYourPersonalInformationForm(String Title) {

//        WAIT
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("id_gender")));
        driver.findElement(By.name("id_gender")).click();
    }

    @Given("^enter your birth_month as \"([^\"]*)\"$")
    public void enterYourBirth_monthAs(String birth_month){
        new Select(driver.findElement(By.name("months"))).selectByVisibleText(birth_month);
    }

    @Given("^enter your birth_year as (\\d+)$")
    public void enterYourBirth_yearAs(String birth_year) {
        new Select(driver.findElement(By.id("years"))).selectByValue(birth_year);
    }

    @Given("^enter your company_name as \"([^\"]*)\"$")
    public void enterYourCompany_nameAs(String company_name){
        driver.findElement(By.id("company")).sendKeys(company_name);
    }

    @Given("^enter your company_address as\"([^\"]*)\"$")
    public void enterYourCompany_addressAs(String company_address){
        driver.findElement(By.id("address1")).sendKeys(company_address);
    }

    @Given("^enter your second line of address as \"([^\"]*)\"$")
    public void enterYourSecondLineOfAddressAs(String  second_line){
        driver.findElement(By.id("address2")).sendKeys(second_line);
    }

    @Given("^enter city as\"([^\"]*)\"$")
    public void enterCityAs(String city){
        driver.findElement(By.id("city")).sendKeys(city);
    }

    @Given("^enter your state from drop down list as\"([^\"]*)\"$")
    public void enterYourStateFromDropDownListAs(String state){
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText(state);
    }

    @Given("^enter your minimum five digit Zip/Postal code as \"([^\"]*)\"$")
    public void enterYourMinimumFiveDigitZipPostalCodeAs(String Zip_postal){
        driver.findElement(By.id("postcode")).sendKeys(Zip_postal);
    }

    @Given("^select your country from drop down list below as\"([^\"]*)\"$")
    public void selectYourCountryFromDropDownListBelowAs(String country){
        driver.findElement(By.id("id_country")).click();
    }

    @Given("^enter some additional information in infromation box as\"([^\"]*)\"$")
    public void enterSomeAdditionalInformationInInfromationBoxAs(String information_box){
        driver.findElement(By.id("other")).sendKeys(information_box);
    }

    @Given("^enter your Home_phone_number as \"([^\"]*)\"$")
    public void enterYourHome_phone_numberAs(String Home_phone_number){
        driver.findElement(By.id("phone")).sendKeys(Home_phone_number);
    }

    @Given("^enter your Mobile_phone_number as \"([^\"]*)\"$")
    public void enterYourMobile_phone_numberAs(String Mobile_phone_number){
        driver.findElement(By.id("phone_mobile")).sendKeys(Mobile_phone_number);
    }

    @Given("^enter your address for future refrence as \"([^\"]*)\"$")
    public void enterYourAddressForFutureRefrenceAs(String refrence){
        driver.findElement(By.id("alias")).sendKeys(refrence);
    }

    @Then("^when I click Register button ,I should see My Account page \"([^\"]*)\"$")
    public void whenIClickRegisterButtonIShouldSeeMyAccountPage(String Expected_result){
        String actual_result;
        actual_result = driver.findElement(By.id("submitAccount")).getText();
        Assert.assertEquals(Expected_result,actual_result);

    }
}










