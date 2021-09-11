Feature: login Functionality
Testing login fuctionality when entering Valid username and valid password

Scenario Outline: Login Successfull

When user enters loginpage
And user enters username <username>
And user enters password <password>
And user clicks submit button
Then user enters successfully

Examples:
	|username|password|
	|"tomsmith"|"SuperSecretPassword!"|
###################################################################################################
Scenario Outline: Login Failed using invalid Username

When user enters loginpage
And user enters username <username>
And user enters password <password>
And user clicks submit button
Then Check wrong username message

Examples:
	|username|password|
	|"tomsmithh"|"SuperSecretPassword!"|
	|"@tomsmith"|"SuperSecretPassword!"|
###################################################################################################

Scenario Outline: Login Failed using invalid password

When user enters loginpage
And user enters username <username>
And user enters password <password>
And user clicks submit button
Then Check wrong password message

Examples:
	|username|password|
	|"tomsmith"|"@SuperSecretPassword!"|
	|"tomsmith"|"SuperSecretPassword"|