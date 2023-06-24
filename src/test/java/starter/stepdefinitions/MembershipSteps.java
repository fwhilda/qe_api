package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.API.Membership;

public class MembershipSteps {
    @Steps
    Membership membership;

    @Given("I set POST api endpoints register Membership")
    public void setPostApiEndpointsRegisterMembership() {
        membership.setPostApiEndpointRegisterMembership();
    }
    @Given("I set POST api endpoints register2 Membership")
    public void setPostApiEndpointsRegister2Membership() {
        membership.setPostApiEndpointRegister2Membership();
    }

    @Given("I set POST api endpoints login Membership")
    public void setPostApiEndpointsLoginMembership() {
        membership.setPostApiEndpointLoginMembership();
    }
    @Given("I set GET api endpoints check email Membership")
    public void setGetApiEndpointsCheckEmailMembership() {
        membership.setGetApiEndpointCheckEmailMembership();
    }
    @Given("I set PUT api endpoints Reset Password Membership")
    public void setPutApiEndpointsResetPasswordMembership() {
        membership.setPutApiEndpointResetPasswordMembership();
    }
    @Given("I set PUT api endpoints Reset Password Membership2")
    public void setPutApiEndpointsResetPasswordMembership2() {
        membership.setPutApiEndpointResetPasswordMembership2();
    }

    @When("I send POST HTTP request register Membership")
    public void sendPostHttpRequestRegisterMembership() {
        membership.sendPostHttpRequestRegisterMembership();
    }
    @When("I send POST HTTP request register2 Membership")
    public void sendPostHttpRequestRegister2Membership() {
        membership.sendPostHttpRequestRegister2Membership();
    }
    @When("I send POST HTTP request register3 Membership")
    public void sendPostHttpRequestRegister3Membership() {
        membership.sendPostHttpRequestRegister3Membership();
    }

    @When("I send POST HTTP request register4 Membership")
    public void sendPostHttpRequestRegister4Membership() {
        membership.sendPostHttpRequestRegister4Membership();
    }

    @When("I send POST HTTP request register5 Membership")
    public void sendPostHttpRequest5Membership() {
        membership.sendPostHttpRequestRegister5Membership();
    }

    @When("I send POST HTTP request register6 Membership")
    public void sendPostHttpRequest6Membership() {
        membership.sendPostHttpRequestRegister6Membership();
    }
    @When("I send POST HTTP request register7 Membership")
    public void sendPostHttpRequest7Membership() {
        membership.sendPostHttpRequestRegister7Membership();
    }

    @When("I send POST HTTP request login Membership")
    public void sendPostHttpRequestLoginMembership() {
        membership.sendPostHttpRequestLoginMembership();
    }
    @When("I send POST HTTP request login2 Membership")
    public void sendPostHttpRequestLogin2Membership() {
        membership.sendPostHttpRequestLogin2Membership();
    }
    @When("I send POST HTTP request login3 Membership")
    public void sendPostHttpRequestLogin3Membership() {
        membership.sendPostHttpRequestLogin3Membership();
    }
    @When("I send POST HTTP request login4 Membership")
    public void sendPostHttpRequestLogin4Membership() {
        membership.sendPostHttpRequestLogin4Membership();
    }
    @When("I send POST HTTP request login5 Membership")
    public void sendPostHttpRequestLogin5Membership() {
        membership.sendPostHttpRequestLogin5Membership();
    }
    @When("I send POST HTTP request login6 Membership")
    public void sendPostHttpRequestLogin6Membership() {
        membership.sendPostHttpRequestLogin6Membership();
    }

    @When("I send GET HTTP request check email Membership")
    public void sendGetHttpRequestCheckEmailMembership() {
        membership.sendGetHttpRequestCheckEmailMembership();
    }
    @When("I send GET HTTP request check email2 Membership")
    public void sendGetHttpRequestCheckEmail2Membership() {
        membership.sendGetHttpRequestCheckEmail2Membership();
    }
    @When("I send GET HTTP request check email3 Membership")
    public void sendGetHttpRequestCheckEmail3Membership() {
        membership.sendGetHttpRequestCheckEmail3Membership();
    }
    @When("I send GET HTTP request check email4 Membership")
    public void sendGetHttpRequestCheckEmail4Membership() {
        membership.sendGetHttpRequestCheckEmail4Membership();
    }

    @When("I send PUT HTTP request Reset Password1 Membership")
    public void sendPutHttpRequestResetPassword1Membership() {membership.iSendPUTHTTPrequestResetPassword1Membership();}
    @When("I send PUT HTTP request Reset Password2 Membership")
    public void sendPutHttpRequestResetPassword2Membership() {membership.iSendPUTHTTPrequestResetPassword2Membership();}
    @When("I send PUT HTTP request Reset Password3 Membership")
    public void sendPutHttpRequestResetPassword3Membership() {membership.iSendPUTHTTPrequestResetPassword3Membership();}
    @When("I send PUT HTTP request Reset Password4 Membership")
    public void sendPutHttpRequestResetPassword4Membership() {membership.iSendPUTHTTPrequestResetPassword4Membership();}
    @When("I send PUT HTTP request Reset Password5 Membership")
    public void sendPutHttpRequestResetPassword5Membership() {membership.iSendPUTHTTPrequestResetPassword5Membership();}

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpMembership() {membership.receiveValidHttp200();}
    @Then("I receive valid HTTP response code 400")
    public void receiveValidHttp400Membership() {
        membership.receiveValidHttp400();
    }
    @Then("I receive valid HTTP response code 404")
    public void receiveValidHttp404Membership() {
        membership.receiveValidHttp404();
    }
    @Then("I receive valid HTTP response code 401")
    public void receiveValidHttp401Membership() {
        membership.receiveValidHttp401();
    }
}
