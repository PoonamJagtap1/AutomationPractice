package com.stepDefinations.pages;

import com.stepDefinations.Driverclass;
import org.openqa.selenium.By;

public class CreateAnAccount_page extends Driverclass {
    public void enterFirstname(String firstName){
        driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
    }
    public void enterLastNameAs(String LastName){
        driver.findElement(By.id("customer_lastname")).sendKeys(LastName);
    }
}

