Feature: OrangeHRM add Employee Functionality
Scenario Outline: OrangeHRM New Employee registration

Given User is already Login Page
When Title of the Login Page of OrangeHRM
Then User enters "<UserName>" and "<Password>" 
Then User click on Login button
Then User is on home page
Then User moves add employee page
Then User enter "<firstName>" and "<lastName>"
Then Close the browser

Examples: 
| UserName | Password | firstName | lastName |
| Admin		 | admin123 | babu			| smith    |
| Admin 	 | admin123 | jrn				| james		 |