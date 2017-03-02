#Author: Vigneshwaran.S

@TestCase
Feature: Magneto site
				 Testcases one

Background:
Given User is in Home Page
When Click on MOBILE menu

@TestCase-one
Scenario: Testcase001
And select SORT BY dropdown as name
Then All products should be sorted by name

#@TestCase-two
#Scenario: Testcase002
#And In the list of all mobile, read the cost of Sony Xperia mobile. Note this value
#And Click on Sony Xperia mobile
#And Read the cost of Sony Xperia mobile from detail page.
#Then Both Value should be same