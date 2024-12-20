package US_20_21_22.StepDefinitions;

import US_20_21_22.Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static Utilities.GWD.driver;

public class _20_HomeworkSteps {
    DialogContent dc=new DialogContent();

    @Given("I am logged into the website")
    public void loggedInToWebsite() {

    }

    @When("I click the {string} button")
    public void clickButton(String buttonName) {
        if (buttonName.equals("Assignments")) {
            dc.assignments.click();
        } else {
            throw new IllegalArgumentException("Button " + buttonName + " not defined");
        }
    }

    @Then("I should see the Assignments page")
    public void verifyAssignmentsPage() {
        Assert.assertTrue(dc.overduesSection.isDisplayed());
    }

    @Given("I am on the Assignments page")
    public void onAssignmentsPage() {
        verifyAssignmentsPage();

    }

    @When("I look at the Overdues section")
    public void lookAtOverduesSection() {
        Assert.assertTrue(dc.overduesSection.isDisplayed());
    }

    @Then("I should see icons on the right side of each overdue item")
    public void verifyOverdueIcons() {
        List<WebElement> icons = driver.findElements(By.cssSelector(".overdue-item .icon"));
        Assert.assertFalse(((List<?>) icons).isEmpty());
    }

    @When("I click on an empty space of an overdue item")
    public void clickEmptySpaceOnOverdue() {
        dc.overdueItem.click();
    }

    @Then("I should see detailed information about the overdue")
    public void verifyOverdueDetails() {
        Assert.assertTrue(dc.overdueDetails.isDisplayed());
    }

    @When("there is a discussion opened for an overdue")
    public void discussionOpenedForOverdue() {
        Assert.assertTrue(dc.discussionIcon.isDisplayed());
    }

    @Then("I should see a discussion icon on the right side of that overdue")
    public void verifyDiscussionIcon() {
        Assert.assertTrue(dc.discussionIcon.isDisplayed());
    }

}
