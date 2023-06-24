package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Membership {
    protected String url = "https://34.128.85.215:8080";

    @Step("I set POST api endpoints register Membership") public String setPostApiEndpointRegisterMembership() {return url + "/users/register";}
    @Step("I set POST api endpoints register2 Membership") public String setPostApiEndpointRegister2Membership() {return url + "/users/regist";}
    @Step("I set POST api endpoints login Membership") public String setPostApiEndpointLoginMembership() {return url + "/users/login";}
    @Step("I set GET api endpoints check email Membership") public String setGetApiEndpointCheckEmailMembership() {return url + "/users/emails/check";}
    @Step("I set PUT api endpoints Reset Password Membership") public String setPutApiEndpointResetPasswordMembership() {return url + "/users/3/password";}
    @Step("I set PUT api endpoints Reset Password Membership2") public String setPutApiEndpointResetPasswordMembership2() {return url + "/users/99/password";}

    @Step("I send POST HTTP request register Membership")
    public void sendPostHttpRequestRegisterMembership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "who@gmail.com");
        requestBody.put("password", "thisispassword123*");
        requestBody.put("name", "who");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());
    }
    @Step("I send POST HTTP request register2 Membership")
    public void sendPostHttpRequestRegister2Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "cabai");
        requestBody.put("password", "thisispassword123*");
        requestBody.put("name", "Cabai");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());
    }
    @Step("I send POST HTTP request register3 Membership")
    public void sendPostHttpRequestRegister3Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "thisispassword123*");
        requestBody.put("name", "Cabai");

        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());}

    @Step("I send POST HTTP request register4Membership")
    public void sendPostHttpRequestRegister4Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "ria@gmail.com");
        requestBody.put("password", "");
        requestBody.put("name", "Cabai");

        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());}

    @Step("I send POST HTTP request register5 Membership")
    public void sendPostHttpRequestRegister5Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rey@gmail.com");
        requestBody.put("password", "thisispassword123*");
        requestBody.put("name", "rey");

        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());}

    @Step("I send POST HTTP request register6 Membership")
    public void sendPostHttpRequestRegister6Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lia@gmail.com");
        requestBody.put("password", "pass1");
        requestBody.put("name", "lia");

        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegisterMembership());}
    @Step("I send POST HTTP request register7 Membership")
    public void sendPostHttpRequestRegister7Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lengkuas@gmail.com");
        requestBody.put("password", "pass1234567");
        requestBody.put("name", "lengkuas");

        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister2Membership());}
    @Step("I send POST HTTP request login Membership")
    public void sendPostHttpRequestLoginMembership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rey@gmail.com");
        requestBody.put("password", "thisispassword123*");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send POST HTTP request login2 Membership")
    public void sendPostHttpRequestLogin2Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anakqeq@gmail.com");
        requestBody.put("password", "anakqe123");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send POST HTTP request login3 Membership")
    public void sendPostHttpRequestLogin3Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anakqe@gmail.com");
        requestBody.put("password", "anakqe1233");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send POST HTTP request login4 Membership")
    public void sendPostHttpRequestLogin4Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fwhilda@gmail.com");
        requestBody.put("password", "anakqe123");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send POST HTTP request login5 Membership")
    public void sendPostHttpRequestLogin5Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "anakqe123");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send POST HTTP request login6 Membership")
    public void sendPostHttpRequestLogin6Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anakqe@gmail.com");
        requestBody.put("password", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginMembership());}
    @Step("I send GET HTTP request check email Membership")
    public void sendGetHttpRequestCheckEmailMembership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anakqe@gmail.com");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(setGetApiEndpointCheckEmailMembership());}
    @Step("I send GET HTTP request check email2 Membership")
    public void sendGetHttpRequestCheckEmail2Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fwhilda@gmail.com");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(setGetApiEndpointCheckEmailMembership());}
    @Step("I send GET HTTP request check email3 Membership")
    public void sendGetHttpRequestCheckEmail3Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(setGetApiEndpointCheckEmailMembership());}
    @Step("I send GET HTTP request check email4 Membership")
    public void sendGetHttpRequestCheckEmail4Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anakqe@gmail");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(setGetApiEndpointCheckEmailMembership());}
    @Step("I send PUT HTTP request Reset Password1 Membership")
    public void iSendPUTHTTPrequestResetPassword1Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "passbaru12345");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpointResetPasswordMembership());}
    @Step("I send PUT HTTP request Reset Password2 Membership")
    public void iSendPUTHTTPrequestResetPassword2Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "passbaru12345");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpointResetPasswordMembership2());}
    @Step("I send PUT HTTP request Reset Password3 Membership")
    public void iSendPUTHTTPrequestResetPassword3Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "passba");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpointResetPasswordMembership());}
    @Step("I send PUT HTTP request Reset Password4 Membership")
    public void iSendPUTHTTPrequestResetPassword4Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpointResetPasswordMembership());}
    @Step("I send PUT HTTP request Reset Password5 Membership")
    public void iSendPUTHTTPrequestResetPassword5Membership() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "passbaru12345");
        SerenityRest.given().relaxedHTTPSValidation().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpointResetPasswordMembership());}
    @Step("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I receive valid HTTP response code 400")
    public void receiveValidHttp400() {restAssuredThat(response -> response.statusCode(400));}
    @Step("I receive valid HTTP response code 404")
    public void receiveValidHttp404() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I receive valid HTTP response code 401")
    public void receiveValidHttp401() {restAssuredThat(response -> response.statusCode(401));}
}
