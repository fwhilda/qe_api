package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Membership;
import starter.API.Suggestions;

public class SuggestionsSteps {
    @Steps
    Suggestions suggestions;

    @Given("I set GET api endpoints suggestions")
    public void setGetApiEndpointsSuggestions() {suggestions.setGetApiEndpointSuggestions();}
    @Given("I set GET api endpoints suggestions2")
    public void setGetApiEndpointsSuggestions2() {suggestions.setGetApiEndpointSuggestions2();}
    @Given("I set GET api endpoints suggestions3")
    public void setGetApiEndpointsSuggestions3() {suggestions.setGetApiEndpointSuggestions3();}
    @Given("I set DELETE api endpoints suggestions")
    public void setDeleteApiEndpointsSuggestions() {suggestions.setDeleteApiEndpointSuggestions();}
    @Given("I set DELETE api endpoints suggestions2")
    public void setDeleteApiEndpointsSuggestions2() {suggestions.setDeleteApiEndpointSuggestions2();}

    @When("I send GET HTTP request suggestions")
    public void sendGetHttpRequestRSuggestions() {suggestions.sendGetHttpRequestSuggestions();}
    @When("I send GET HTTP request suggestions2")
    public void sendGetHttpRequestRSuggestions2() {suggestions.sendGetHttpRequestSuggestions2();}
    @When("I send GET HTTP request suggestions3")
    public void sendGetHttpRequestRSuggestions3() {suggestions.sendGetHttpRequestSuggestions3();}
    @When("I send DELETE HTTP request suggestions")
    public void sendDeleteHttpRequestRSuggestions() {suggestions.sendDeleteHttpRequestSuggestions();}
    @When("I send DELETE HTTP request suggestions2")
    public void sendDeleteHttpRequestRSuggestions2() {suggestions.sendDeleteHttpRequestSuggestions2();}

}