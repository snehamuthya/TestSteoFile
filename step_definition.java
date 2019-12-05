package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import hellocucumber.findRestaurant;


public class step_definition {
	
	private String areaCode;
	private String message;

@Given("I want food in {string}")
public void i_want_food_in (String string) {
    areaCode = string;
}

@When("I search for restaurants")
public void i_search_for_restaurants() {
	findRestaurant fr = new findRestaurant();
    message = fr.findRes(areaCode);
}

@Then("I should see some {string}")
public void i_should_see_some () {
    System.out.println (message);
}