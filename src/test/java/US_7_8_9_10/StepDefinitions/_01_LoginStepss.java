package US_7_8_9_10.StepDefinitions;



import US_7_8_9_10.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginStepss {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");


    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.username, "Student_8");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.loginButton);


    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.LoginContainsText(dc.entryText, "Internship");

    }
}
