package TestRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"stepDefinition"})	
//@CucumberOptions(plugin = {"pretty", "json:target/report.json", "cucumber-reporting:target/pretty-cucumber"}, features = {"classpath:features"})
public class Runner 				
{		

}