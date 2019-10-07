Feature: FreeCRM deals data creation
Scenario: FreeCRM create a new deal scenario

Given User is already Login Page
When Title of the Login Page is FreeCRM
Then User enters Username and Password
	| Username         | Password |
	| naveenautomation | test@123 |
	
Then User clicks on Login Page
Then User is on Home Page
Then User moves to new Deal Page
Then User enters deal details
	| title | amount | Probability | commission |
	| deal01 | 1000  | 50					 | 10					|
	| deal02 | 2000	 | 60					 | 20					|
	| deal03 | 3000	 | 70					 | 30					|
	
Then Close the browser