Feature: checkboxes feature

@cb
Scenario: To verify the checkbox option present on the home page 
Given "ie" browser is selected
Then launch url "https://the-internet.herokuapp.com/"
And verify page by url "https://the-internet.herokuapp.com/"
Then click on "Checkboxes"
And verify page by url "https://the-internet.herokuapp.com/checkboxes"
And click checkbox 1
And click checkbox 2
