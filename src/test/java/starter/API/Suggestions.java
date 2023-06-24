package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Suggestions {
    protected String url = "https://34.128.85.215:8080";
    @Step("I set GET api endpoints suggestions") public String setGetApiEndpointSuggestions() {return url + "/auth/admins/suggestions";}
    @Step("I set GET api endpoints suggestions2") public String setGetApiEndpointSuggestions2() {return url + "/auth/admins/suggestions/5";}
    @Step("I set GET api endpoints suggestions3") public String setGetApiEndpointSuggestions3() {return url + "/auth/admins/suggestions/99";}
    @Step("I set DELETE api endpoints suggestions") public String setDeleteApiEndpointSuggestions() {return url + "/auth/admins/suggestions/5";}
    @Step("I set DELETE api endpoints suggestions2") public String setDeleteApiEndpointSuggestions2() {return url + "/auth/admins/suggestions/99";}


    @Step("I send GET HTTP request suggestions")
    public void sendGetHttpRequestSuggestions() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZGV2ZWxvcGVya2VjZSIsInJvbGUiOiJ1c2VyIiwidXNlcl9pZCI6MX0.NMj4b7Ip1Zb8R9eSUK14cFxoaBCfvhk8lounXXDHQFg").get(setGetApiEndpointSuggestions()).then().statusCode(200);}
    @Step("I send GET HTTP request suggestions2")
    public void sendGetHttpRequestSuggestions2() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZGV2ZWxvcGVya2VjZSIsInJvbGUiOiJ1c2VyIiwidXNlcl9pZCI6MX0.NMj4b7Ip1Zb8R9eSUK14cFxoaBCfvhk8lounXXDHQFg").get(setGetApiEndpointSuggestions2()).then().statusCode(200);}
    @Step("I send GET HTTP request suggestions3")
    public void sendGetHttpRequestSuggestions3() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZGV2ZWxvcGVya2VjZSIsInJvbGUiOiJ1c2VyIiwidXNlcl9pZCI6MX0.NMj4b7Ip1Zb8R9eSUK14cFxoaBCfvhk8lounXXDHQFg").get(setGetApiEndpointSuggestions3()).then().statusCode(400);}
    @Step("I send DELETE HTTP request suggestions")
    public void sendDeleteHttpRequestSuggestions() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZGV2ZWxvcGVya2VjZSIsInJvbGUiOiJ1c2VyIiwidXNlcl9pZCI6MX0.NMj4b7Ip1Zb8R9eSUK14cFxoaBCfvhk8lounXXDHQFg").delete(setDeleteApiEndpointSuggestions()).then().statusCode(200);}
    @Step("I send DELETE HTTP request suggestions2")
    public void sendDeleteHttpRequestSuggestions2() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZGV2ZWxvcGVya2VjZSIsInJvbGUiOiJ1c2VyIiwidXNlcl9pZCI6MX0.NMj4b7Ip1Zb8R9eSUK14cFxoaBCfvhk8lounXXDHQFg").delete(setDeleteApiEndpointSuggestions2()).then().statusCode(400);}
}
