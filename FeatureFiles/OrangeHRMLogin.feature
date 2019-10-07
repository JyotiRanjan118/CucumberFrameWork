Feature: OrangeHRM Application Functionality Testing
Scenario Outline: Validating Login Functionality of OrangeHRM

Given Open Chrome browser and navigate to OrangeHRM Application
When User enters "<UserName>" and "<Password>" & click on Login Application
Then User should be able to successfully login to the Application and close the applcation

Examples:
| UserName | Password |
| Admin		 | admin123 |
| admin		 | jr118		|


