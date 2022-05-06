Feature: Add a valid candidate 


@Sanity1 
Scenario: Verify a valid candidate added 
	Given Open OrangeHRM application "<URL>" 
	Then Access OrangeHRM with the credentials 
	When  Go to the “candidates” page and click on recruitment then navigate to candidates 
	And Click Add button and add a new candidate enter all form fields 
	Then Validate Successfully Saved -message displayed after adding a new candidate