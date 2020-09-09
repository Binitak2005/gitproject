Feature: To test the OrangeLogin functionality

Scenario Outline: To check the login functionality 
Given to verify the title of the page
When To enter "<username>" and "<password>"
Then To click the submit button


Examples:
|username|password|
|admin|admin123|
|admin|admin123|