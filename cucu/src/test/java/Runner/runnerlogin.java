package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="",

features= {"C:\\Users\\Lenovo\\eclipse-workspace\\cucu\\src\\test\\resources\\Logintest.feature"},///address of feature
glue= {"StepDefination"},//stepdefination ----address-----package name
plugin= {"pretty","html:target/newjavarun.html"}//----report ....html+pretty
					
		)

public class runnerlogin extends AbstractTestNGCucumberTests{

}
