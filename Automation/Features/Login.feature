Feature:  Login functionality for DemoQA.com

Scenario: Verify that user is able to successfully login  to demoqa.com web site
 			Given A user is on Demoqa.com
 			When User clicks on MyAccounts link 
			And  User logs in using valid username and password
			Then User is taken to my accounts page 