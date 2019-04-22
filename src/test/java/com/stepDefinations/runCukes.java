package com.stepDefinations;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



//RUNCUKES AT SCENARIOS LEVEL.
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",tags={"@smoke"})

public class runCukes {




//RUNCUKES AT FEATURE FILE LEVEL.
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources",tags="@smoke")
//public class runCukes{
//}
}


