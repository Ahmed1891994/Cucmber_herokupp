Feature: CheckBoxPage Test
Testing checkboxes position, default selection, Set and clear Functionalities

Scenario: Checkbox_one_position

When user enters CheckBoxPage
Then Check Checkbox_one disblayed

#####################################################################################
Scenario: Checkbox_two_position

When user enters CheckBoxPage
Then Check Checkbox_two disblayed
#####################################################################################
Scenario: Checkbox_one_Default

When user enters CheckBoxPage
Then Check Checkbox_one is Cleared

#####################################################################################
Scenario: Checkbox_two_Default

When user enters CheckBoxPage
Then Check Checkbox_two is set

#####################################################################################
Scenario: Checkbox_one_Set

When user enters CheckBoxPage
When user sets Checkbox_one
Then Check Checkbox_one is set
#####################################################################################
Scenario: Checkbox_two_Set

When user enters CheckBoxPage
When user clears Checkbox_two
When user sets Checkbox_two
Then Check Checkbox_two is set
#####################################################################################
Scenario: Checkbox_one_Clear

When user enters CheckBoxPage
When user sets Checkbox_one
When user clears Checkbox_one
Then Check Checkbox_one is Cleared
#####################################################################################
Scenario: Checkbox_two_Clear

When user enters CheckBoxPage
When user clears Checkbox_two
Then Check Checkbox_two is Cleared