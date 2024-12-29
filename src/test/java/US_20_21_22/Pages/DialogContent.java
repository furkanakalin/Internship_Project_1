package US_20_21_22.Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[page='ASSIGNMENT']>button")
    public WebElement assignments;

    @FindBy(css = "#overdues-section")
    public WebElement overduesSection;

    @FindBy(css = ".overdue-item")
    public WebElement overdueItem;

    @FindBy(css = ".overdue-details")
    public WebElement overdueDetails;

    @FindBy(css = ".discussion-icon")
    public WebElement discussionIcon;

    public WebElement getElement(String elementName) {
        switch (elementName) {
            case "assignments": return  this.assignments;
            case "overduesSection": return overduesSection;
            case "overdueItem": return overdueItem;
            case "overdueDetails": return overdueDetails;
            case "discussionIcon": return discussionIcon;
            default: throw new IllegalArgumentException("Element " + elementName + " not defined in AssignmentsPage");
        }
    }

}