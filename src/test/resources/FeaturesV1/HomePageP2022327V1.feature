Feature: Login page is properly displayed   


@Sanity
Scenario: Verify login page properly display
Given Open application "<URL>"
Then Verify login page properly displayed 
Then Input username and password and click
Then Verify customer successfully logged in
Then Verify Inventory page is displayed properly
