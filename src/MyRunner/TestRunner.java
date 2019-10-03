package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="D:\\Java\\Java Project\\Application Under Test\\Selenium_Cucumber\\OrangeHRM\\OHRMaddEmp.feature",
		glue= {"step_Defination"},
		format= {"pretty","html:test-output"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
public class TestRunner {

}
