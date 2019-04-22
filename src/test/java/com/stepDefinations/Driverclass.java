package com.stepDefinations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public static WebDriver driver;
public class Driverclass {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.automationpractice.com");
//        driver.get("https://www.d3dsecurity.co.uk/");
    }


    {

//    public void closeBrowser() {
//        driver.quit();
    }
}

