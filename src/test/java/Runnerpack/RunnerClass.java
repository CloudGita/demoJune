package Runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Darshan\\Maven_WorkSpace\\"
		+ "CucumberTestSuite\\src\\test\\resources\\FeatureFile\\Orangehrm.feature",
glue = "com.stepdefnition",monochrome = true,publish = true, dryRun = true)
public class RunnerClass {

}
