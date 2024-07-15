package Cucumrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rkavi\\eclipse-workspace\\"
		+ "Cucumberproject\\src\\test\\java\\Cucum\\background.feature",
		glue="Cucumstep",tags="@background",monochrome=true,snippets = SnippetType.CAMELCASE,
		dryRun=!true)
public class backgroundrunner {

}
