Feature: Multi windows Functionality
Testing new windows opened

#####################################################################################
Scenario: Open new window Successfully
When user enters multiplewindowspage
And user Clicks on clickme
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window

#####################################################################################
Scenario: Open 2 new windows Successfully
When user enters multiplewindowspage
And user Clicks on clickme
And user Clicks on clickme
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window

#####################################################################################
Scenario: Open new multiple windows Successfully
When user enters multiplewindowspage
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Clicks on clickme
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
And user Switches to new window
Then Check new open window
And user closes new window
Then Check original window

