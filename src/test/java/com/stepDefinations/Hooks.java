package com.stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    Driverclass driverC =new Driverclass();
    @Before
    public void browser(){
        driverC.openBrowser();

    }
//    @After
//    public void close(){
//        driverC.closeBrowser();
//    }

}
