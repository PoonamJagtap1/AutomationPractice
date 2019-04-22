package com.stepDefinations.pages;

import com.stepDefinations.Driverclass;
import org.openqa.selenium.By;

public class CreateAnAcctRegister_page extends Driverclass {


    public void enterEmailaddress(String emailId){
     driver.findElement(By.id("email")).sendKeys(emailId);
    }
public void click_on_sign_in_button (){

        driver.findElement(By.linkText("Sign in")).click();
}
public void enterpassword(String password){
        driver.findElement(By.id("passwd")).sendKeys(password);

}
public void enter_Sign_Button(){

        driver.findElement(By.id("SubmitLogin")).click();
}
}
