package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProfileSettingsSteps {
    DialogContent dc = new DialogContent();

    @Given("Click the Profile")
    public void clicktheProfile() {
        dc.myClick(dc.profileButton);
    }

    @And("Click the Settings Button")
    public void clickTheSettingsButton() {

        dc.myClick(dc.settingsButton);
    }
    @And("Click the Profile Picture and Load Button")
    public void clickTheProfilePictureAndLoadButton() {
        dc.myClick(dc.profilePicture);
        dc.myClick(dc.loadButton);
    }

    @When("Choise the Profile Picture and Click Save Button")
    public void choiseTheProfilePictureAndClickSaveButton() {
        dc.mySendKeys(dc.loadButton, "fenerlogoy.png");
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.savePhotoButton));
        dc.myClick(dc.savePhotoButton);
    }

     @Then("User should save succesfuly")
    public void userShouldSaveSuccesfuly() {
     }

    @Given("Click the Profile Button")
    public void clickTheProfile() {
        dc.myClick(dc.profileButton);
    }

    @And("Click the Settings and  Click the Theme")
    public void clickTheSettingsAndClickTheTheme() {
        dc.myClick(dc.settingsButton);
        dc.myClick(dc.theme);
    }

    @When("Click the Purple Theme and click the Save Button")
    public void clickThePurpleThemeAndClickTheSaveButton() {
        dc.myClick(dc.purpleTheme);
        dc.myClick(dc.saveButtonTwo);
    }

    @Then("User should save succesfuly")
    public void userShouldSaveSuccesfuly(String value) {
        dc.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-expansion-panel-header-20")));
        Assert.assertEquals("Kayıt başarısız","Profile successfully updated");
    }

    @Given("Click the Grading Button")
    public void clickTheGradingButton() {
        dc.myClick(dc.gradingButton);
    }

    @When("User should clickable the Student Transcripts Button")
    public void userShouldClickableTheStudentTranscriptsButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-tab-group-0-label-1")));
        dc.myClick(dc.studentTranscripts);
    }

    @Then("Transcript Subject Button")
    public void transcriptSubjectButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-tab-group-0-label-2")));
        dc.myClick(dc.transcriptSubject);
    }
}

