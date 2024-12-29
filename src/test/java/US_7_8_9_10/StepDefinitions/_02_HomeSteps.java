package US_7_8_9_10.StepDefinitions;


import US_7_8_9_10.Pages.DialogContent;
import US_7_8_9_10.Pages.HeaderMenu;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Set;

public class _02_HomeSteps {
    DialogContent dc=new DialogContent();
    HeaderMenu hd=new HeaderMenu();

    @Given("Click on the Company logo")
    public void clickOnTheCompanyLogo() {
        hd.myClick(hd.TechnoStudyLink);
    }

    @Then("Assert that logo directs to the Website")
    public void assertThatLogoDirectsToTheWebsite() {
        String originalWindow= GWD.getDriver().getWindowHandle();
        Set<String> allWindowHandles = GWD.getDriver().getWindowHandles();


        for (String handle:allWindowHandles){
            if (!handle.equals(originalWindow)) {
                GWD.getDriver().switchTo().window(handle);
                System.out.println(GWD.getDriver().getCurrentUrl());
                Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("https://techno.study/"), "The webpage doesn't match");
            }
    }
}}
