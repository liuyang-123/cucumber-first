package com.agiletestware;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "Yes" : "Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("Today is ([^\"]*)$")
    public void today_is_Sunday(String today) {
        // Write code here that turns the phrase above into concrete actions
        this.today = today;

    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedAnswer, actualAnswer);
    }

}
