package com.stepDefinations.pages;

import com.stepDefinations.Driverclass;
import org.openqa.selenium.By;

public class Createanacct1_page extends Driverclass {
public void enterFirstname(String Firstname){
    driver.findElement(By.id("customer_firstname")).sendKeys(Firstname);
}
public void enterLastname(String Lastname){
    driver.findElement(By.id("customer_lastname")).sendKeys(Lastname);
}
public void enterEmailid(String Emailid){
    driver.findElement(By.id("email")).sendKeys(Emailid);
}
public void enterPassword(String Password){
    driver.findElement(By.id("passwd")).sendKeys(Password);
}
public void enterDay(String Day){
    driver.findElement(By.id("days")).click();
}
public void enterMonth(String Month){
    driver.findElement(By.id("months")).click();
}
public void enterYear(String Year){
    driver.findElement(By.id("years")).click();
}
}
