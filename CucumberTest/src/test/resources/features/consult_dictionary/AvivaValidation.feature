Feature: Aviva Home Page Validation

@GoogleSearch
Scenario Outline: Google Validation
Given I want to open the Browser and Start the Application
When I enter some value '<input>' in the Google Search box
And I should click on Google Submit Button
Then Count and Print Number of Links in the Google
And Print the text of '<index>' link in the Google Page

Examples:
|input| |index|
|Aviva| |2|


@AvivaTitleValidation
Scenario Outline: Aviva Validation
Given I want to open the Browser and Start the Application
When I enter some value '<input>' in the Google Search box
And I should click on Google Submit Button
Then click on Aviva Login Link in the Google Search
And validate the'<title>' of the Home Page

Examples:
|input| |title|
|Aviva| |Aviva Life Insurance - Login|



@AvivaErrorMessageValidation
Scenario Outline: Aviva Validation
Given I want to open the Browser and Start the Application
When I enter some value '<input>' in the Google Search box
And I should click on Google Submit Button
Then click on Aviva Login Link in the Google Search
Then click on SignUp Button and Submit Button
And validate the text of the ErrorMessage in Aviva Home Page

Examples:
|input|
|Aviva|






