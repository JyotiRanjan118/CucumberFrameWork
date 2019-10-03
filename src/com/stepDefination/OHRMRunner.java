package com.stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="OrangeHRM/OHRM.feature",
		glue= {"stepDefination"},
		format= {"pretty","html:test-output"},
		monochrome=true, // display the console output in a proper readable format
		strict=true,
		dryRun=false
		
	)
public class OHRMRunner {
	
}
