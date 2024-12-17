package US_7_8_9_10.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderMenu  extends ParentPage{

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement TechnoStudyLink;

    @FindBy(css = "[page='COURSES']>button")
    public WebElement Courses;

    @FindBy(css = "[page='CALENDAR']>button")
    public WebElement Calendar;

    @FindBy(css = "[page='ATTENDANCE']>button")
    public WebElement attendance;

    @FindBy(css = "[page='ASSIGNMENT']>button")
    public WebElement assignments;

    @FindBy(css = "[page='GRADING']>button")
    public WebElement grading;

    @FindBy(xpath = "//div/span/span/button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//user-message-bell/button")
    public WebElement messages;

    @FindBy(xpath = "//mat-toolbar//div/button")
    public WebElement profile;

    @FindBy(xpath = "//student-toolbar-horizontal//button")
    public List<WebElement> buttonsHeader;

    @FindBy(xpath = "//div[@dir='ltr']//button//span[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//button//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "//button//span[text()='Finance']")
    public WebElement finance;

    @FindBy(xpath = "//button//span[text()='My Finance']")
    public WebElement myfinance;

    @FindBy(xpath = "//div[@dir='ltr']//button//span[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//button//span[text()='Trash']")
    public WebElement trash;

    public WebElement getWebElement(String strElementName){

        switch (strElementName)
        {
            case "courses" : return this.Courses;
            case "calendar": return  this.Calendar;
            case "attendance": return this.attendance;
            case "assignments": return  this.assignments;
            case "grading": return  this.grading;
            case "hamburgerMenu": return  this.hamburgerMenu;
            case "messages": return this.messages;
            case "profile": return this.profile;
            case "sendMessage": return this.sendMessage;
            case "messaging": return this.messaging;
            case "outbox": return this.outbox;
            case "trash": return this.trash;
            case "finance": return this.finance;
            case "myFinance": return this.myfinance;


        }

        return null;
    }

}
