package testRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                  glue="stepDefination",
                  dryRun = false,
                  monochrome = true,
                  format = {"pretty","html:Cucumber_report"})
public class Registeration_runner {

}
