Feature: Google Search
I want to enter some text on google and search username and pwd as a parameter


Scenario: Google Search Scenario1
Given the user is on google Page
When he enters "Java" as search text
And he clicks on search button
Then check search result display properly or not

