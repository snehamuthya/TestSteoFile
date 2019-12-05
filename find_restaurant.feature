Feature: Use the website to find restaurants
          So that I can order food
          As a hungry customer
           I want to be able to find restaurants in my area

  Scenario outline: Search for restaurant with different area codes
	   Given I want food in "<areacode>"
	   When I search for restaurants
	   Then I should see some <result>

  Examples:
	| areacode		| result								|
	| AR51 1AA 		| restaurants in "AR51 1AA"				|
	| AR123 1AA		| Please enter a full, valid postcode	|
	| <null>		| Please enter a postcode				|