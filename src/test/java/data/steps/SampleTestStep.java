package data.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.pages.SamplePage;

public class SampleTestStep {

    @Given("^On Homepage click on register$")
    public void onHomepageClickOnRegister() throws Exception {
        SamplePage.clickRegister();
    }

    @When("^On the page input name \"([^\"]*)\"$")
    public void onThePageInputName(String name) {
        SamplePage.inputName(name);
    }

    @Then("^On the page input email \"([^\"]*)\"$")
    public void onThePageInputEmail(String mail) {
        SamplePage.inputEmail(mail);
    }

    @And("^On the page input password \"([^\"]*)\"$")
    public void onThePageInputPassword(String pass) {
        SamplePage.inputPassword(pass);
    }

    @And("^On the page input confirmation password \"([^\"]*)\"$")
    public void onThePageInputConfirmationPassword(String cpass) {
        SamplePage.inputConfirmPassword(cpass);
    }

    @Then("^On the page click submit$")
    public void onThePageClickSubmit() {
        SamplePage.submitRegisterButton();
    }

    @And("^On the page verify message \"([^\"]*)\"$")
    public void onThePageVerifyMessage(String result) {
        SamplePage.verifySnackBarText(result);
    }

    @And("^On the page verify error message \"([^\"]*)\"$")
    public void onThePageVerifyErrorMessage(String txt) throws Throwable {
        SamplePage.verifyErrorMessage(txt);
    }

    @And("^On the page click login$")
    public void onThePageClickLogin() {
        SamplePage.clickLoginButton();
    }

    @Then("^On the page verify login with credential \"([^\"]*)\"$")
    public void onThePageVerifyLoginWithCredential(String mail) throws Throwable {
        SamplePage.verifyLoginCredential(mail);
    }
}
