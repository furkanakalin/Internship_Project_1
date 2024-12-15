package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.*;

public class Calender {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();

    @Given("the user is on the Weekly Course Plan page")
    public void theUserIsOnTheWeeklyCoursePlanPage() {
        dc.myClick(tn.calendarButton);
    }

    @And("user should view today's date and the Weekly Course Plan")
    public void userShouldViewTodaySDateAndTheWeeklyCoursePlan() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.dateVerify));
        Assert.assertTrue(dc.dateVerify.isDisplayed());

        dc.wait.until(ExpectedConditions.visibilityOf(dc.coursePlanTableVerify));
        Assert.assertTrue(dc.coursePlanTableVerify.isDisplayed());
    }

    @And("user should view the P,S,E,C icons")
    public void userShouldViewThePSECIcons() {
        Assert.assertTrue(dc.pIcon.isDisplayed());
        Assert.assertTrue(dc.sIcon.isDisplayed());
        Assert.assertTrue(dc.eIcon.isDisplayed());
        Assert.assertTrue(dc.cIcon.isDisplayed());
    }

    @And("user should view the descriptions of the lectures")
    public void userShouldViewTheDescriptionsOfTheLectures() {
        Assert.assertTrue(dc.pDesc.isDisplayed());
        Assert.assertTrue(dc.sDesc.isDisplayed());
        Assert.assertTrue(dc.eDesc.isDisplayed());
        Assert.assertTrue(dc.cDesc.isDisplayed());
    }

    @When("user should view Weekly Course Plan and Calender buttons on the page")
    public void userShouldViewWeeklyCoursePlanAndCalenderButtonsOnThePage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.weeklyButton));
        Assert.assertTrue(dc.weeklyButton.isDisplayed());

        dc.wait.until(ExpectedConditions.visibilityOf(dc.calendarButton));
        Assert.assertTrue(dc.calendarButton.isDisplayed());
    }

    @Then("user click on the buttons and redirected to the respective pages")
    public void userClickOnTheButtons() {
        dc.myClick(dc.weeklyButton);
        Assert.assertTrue(dc.coursePlanTableVerify.isDisplayed());

        dc.myClick(dc.calendarButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.calendarTableVerify));
        Assert.assertTrue(dc.calendarTableVerify.isDisplayed());
    }

    @Then("the user should see icons to navigate forward and backward \\(Previous, Today, Next) on the page")
    public void theUserShouldSeeIconsToNavigateForwardAndBackwardPreviousTodayNextOnThePage() {
        List<WebElement> buttons = Arrays.asList(dc.previousButton, dc.todayButton, dc.nextButton);
        buttons.forEach(button -> Assert.assertTrue(button.isDisplayed(), button + " is not displayed"));
    }

    @When("the user clicks on the navigation icons")
    public void theUserClicksOnTheNavigationIcons(DataTable Icons) {
        List<String> icons = Icons.asList();

        for (int i = 0; i < icons.size(); i++) {
            dc.myClick(dc.getWebElement(icons.get(i)));
            dc.wait.until(ExpectedConditions.visibilityOf(dc.dateVerify));
            Assert.assertTrue(dc.dateVerify.isDisplayed());
        }
    }

    @And("the user should see the list of courses they are responsible for")
    public void theUserShouldSeeTheListOfCoursesTheyAreResponsibleFor() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.coursePlanTableVerify));
        Assert.assertTrue(dc.coursePlanTableVerify.isDisplayed());
    }

    @When("the user clicks on the {string}")
    public void theUserClicksOnThe(String arg0) {
        Random random = new Random();
        List<WebElement> lessonsButton = dc.lessonsButton;

        if (!lessonsButton.isEmpty()) {
            int randomIndex = random.nextInt(lessonsButton.size());
            dc.myClick(lessonsButton.get(randomIndex));
        }
    }

    @Then("the user should see the details of the {string}")
    public void theUserShouldSeeTheDetailsOfThe(String arg0) {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.lessonMessage));
        Assert.assertTrue(dc.lessonMessage.getText().contains("started"));
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
        dc.myClick(dc.calendarButton);
    }

    @When("the user views the following details on the Weekly Course Plan page:")
    public void theUserViewsTheFollowingDetailsOnTheWeeklyCoursePlanPage() {
        if (dc.weeklyCoursePlanBtn.isDisplayed()) {
            dc.wait.until(ExpectedConditions.visibilityOf(dc.pIcon));
            if (dc.pIcon.isDisplayed() && dc.pDescription.isDisplayed()) {
                dc.verifyContainsText(dc.pIcon, "P");
                dc.verifyContainsText(dc.pDescription, "Published");
            }

            dc.wait.until(ExpectedConditions.visibilityOf(dc.sIcon));
            if (dc.sIcon.isDisplayed() && dc.sDescription.isDisplayed()) {
                dc.verifyContainsText(dc.sIcon, "S");
                dc.verifyContainsText(dc.sDescription, "Started");
            }

            dc.wait.until(ExpectedConditions.visibilityOf(dc.eIcon));
            if (dc.eIcon.isDisplayed() && dc.eDescription.isDisplayed()) {
                dc.verifyContainsText(dc.eIcon, "E");
                dc.verifyContainsText(dc.eDescription, "Ended");
            }

            dc.wait.until(ExpectedConditions.visibilityOf(dc.cIcon));
            if (dc.cIcon.isDisplayed() && dc.cDescription.isDisplayed()) {
                dc.verifyContainsText(dc.cIcon, "C");
                dc.verifyContainsText(dc.cDescription, "Cancelled");
            }

            dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.teacherText));
            dc.verifyContainsText(dc.teacherText, "Teacher");

            dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.courseControlText));
            dc.verifyContainsText(dc.courseControlText, "11A");
        }
    }

    @And("the user clicks on a completed course marked as {string}")
    public void theUserClicksOnACompletedCourseMarkedAs(String arg0) {
        List<String> popupTabMenu = new ArrayList<>();
        Collections.addAll(popupTabMenu, "Topic", "Attachments", "Recent Events");

        List<String> btn = dtBtn.asList();
        for (int i = 0; i < btn.size(); i++) {
            dc.myClick(dc.getWebElement(btn.get(i)));
            Assert.assertTrue(dc.recordButton.isDisplayed());
            Assert.assertTrue(dc.getWebElement(btn.get(i)).getText().contains(popupTabMenu.get(i)));
        }
        dc.wait.until(ExpectedConditions.visibilityOf(dc.recordButton));
        dc.myClick(dc.recordButton);
        dc.wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
        dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.videoIframe));

        GWD.getDriver().switchTo().frame(0);
        dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.playVideoBtn));
        Assert.assertTrue(dc.playVideoBtn.isDisplayed());
        GWD.getDriver().switchTo().parentFrame();
        dc.myClick(dc.closeButton);

        dc.wait.until(ExpectedConditions.visibilityOf(dc.closeIconBtn));
        dc.myClick(dc.closeIconBtn);
    }

    @Then("the user verifies the following elements in the opened pop-up window:")
    public void theUserVerifiesTheFollowingElementsInTheOpenedPopUpWindow(DataTable dtBtn) {
        List<String> expectedPopupTabMenu = Arrays.asList("Topic", "Attachments", "Recent Events");

        List<String> actualButtons = dtBtn.asList();

        for (int i = 0; i < actualButtons.size(); i++) {
            WebElement button = dc.getWebElement(actualButtons.get(i));
            dc.myClick(button);
            Assert.assertTrue(dc.recordButton.isDisplayed(), "Recording button is not displayed");
            Assert.assertTrue(button.getText().contains(expectedPopupTabMenu.get(i)),
                    "Button text does not match the expected tab menu");

            dc.wait.until(ExpectedConditions.elementToBeClickable(dc.recordButton));
            dc.myClick(dc.recordButton);

            dc.wait.until(driver ->
                    ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));

            dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.videoIframe));

            GWD.getDriver().switchTo().frame(0);
            dc.wait.until(ExpectedConditions.visibilityOf(dc.playVideoBtn));
            Assert.assertTrue(dc.playVideoBtn.isDisplayed(), "Play video button is not displayed");

            GWD.getDriver().switchTo().parentFrame();

            dc.myClick(dc.closeButton);

            dc.wait.until(ExpectedConditions.visibilityOf(dc.closeIconBtn));
            dc.myClick(dc.closeIconBtn);
        }
    }

    @When("the user clicks on a Course Meeting that has not yet started")
    public void theUserClicksOnACourseMeetingThatHasNotYetStarted() {
        String expectedUrl = ConfigReader.getProperty("calendarURL");
        dc.wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), expectedUrl, "URL did not match expected calendar URL");


        dc.wait.until(ExpectedConditions.visibilityOf(dc.selectsLesson));
        dc.myClick(dc.selectsLesson);
    }

    @Then("the user verifies the following information:")
    public void theUserVerifiesTheFollowingInformation(DataTable lectures) {
        List<String> informationList = lectures.asList(String.class);

        for (String info : informationList) {
            switch (info) {
                case "teacherName":
                    Assert.assertTrue("Teacher's name is not displayed", dc.teacherName.isDisplayed());
                    break;
                case "dateAndTime":
                    Assert.assertTrue("Date and Time are not displayed", dc.dateAndTime.isDisplayed());
                    break;
                case "warningMessage":
                    Assert.assertTrue("Warning message is not displayed", dc.warningMessage.isDisplayed());
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected information: " + info);
            }
        }

    }

    @When("the user selects a completed course marked as {string}")
    public void theUserSelectsACompletedCourseMarkedAs(String courseName) {
        Random random = new Random();
        List<WebElement> endedLessons = dc.endedLessonBtn;

        if (!endedLessons.isEmpty()) {
            int randomIndex = random.nextInt(endedLessons.size());
            WebElement randomLesson = endedLessons.get(randomIndex);

            String lessonText = randomLesson.getText();
            if (lessonText.contains(courseName)) {
                dc.myClick(randomLesson);
                dc.verifyContainsText(dc.popUpVerify, "Information");
            } else {
                System.out.println("Selected lesson does not match the expected course name.");
            }
        } else {
            System.out.println("No ended lessons available to click.");
        }
    }

    @Then("the user verifies and clicks on the {string} button to access the course recording")
    public void theUserVerifiesAndClicksOnTheButtonToAccessTheCourseRecording(String buttonText) {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.recordButton));

        Assert.assertTrue(dc.recordButton.getText().contains(buttonText), "Button text doesn't match");

        dc.myClick(dc.recordButton);
    }

    @And("the user opens the course video")
    public void theUserOpensTheCourseVideo() {
        dc.wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));

        dc.wait.until(ExpectedConditions.visibilityOf(dc.videoIframe));

        GWD.getDriver().switchTo().frame(dc.videoIframe);

        dc.wait.until(ExpectedConditions.visibilityOf(dc.playVideoBtn));
        Assert.assertTrue(dc.playVideoBtn.isDisplayed(), "Play button is not displayed");
    }

    @Then("the user sees the {string} button on the video and clicks on it")
    public void theUserSeesTheButtonOnTheVideoAndClicksOnIt(String playVideoBtn) {
        WebElement button = dc.getWebElement(playVideoBtn);
        Assert.assertTrue(button.isDisplayed(), playVideoBtn + " button is not displayed");

        dc.myClick(button);
    }

    @And("the user starts watching the video")
    public void theUserStartsWatchingTheVideo() {
        GWD.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        GWD.getDriver().switchTo().parentFrame();
    }
}
