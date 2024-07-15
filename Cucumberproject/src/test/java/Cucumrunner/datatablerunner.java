package Cucumrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

//import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rkavi\\eclipse-workspace\\Cucumberproject\\"
		+ "src\\test\\java\\Cucum\\Examples.feature",glue={"Cucumstep","com.hooks"},plugin= {"html:report/webreport","json:report/jsonreport","xml:report/xmlreport.xml"},dryRun=!true,monochrome=true,snippets=SnippetType.CAMELCASE)
public class datatablerunner {

}
