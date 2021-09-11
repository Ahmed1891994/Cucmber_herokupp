Feature: Multi windows Functionality
Testing Multi windows


#####################################################################################
Scenario: Open new multiple windows Successfully

When user enters multiplewindowspage
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window

