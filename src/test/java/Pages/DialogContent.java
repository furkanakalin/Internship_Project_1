package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//span[text()=' Welcome, Student_6 11A ! ']")
    public WebElement loginControl;

    @FindBy(xpath = "//*[contains(text(),' Weekly Course Plan ')]")
    public WebElement weeklyButton;

    @FindBy(xpath = "(//*[text()=' Calendar '])[2]")
    public WebElement calendarButton;

    @FindBy(xpath = "//table[@role='grid']")
    public WebElement calendarTableVerify;

    @FindBy(xpath = "//div[@class='user-info']/img")
    public WebElement uploadPhotoBtn;

    @FindBy(css = "mat-form-field button")
    public WebElement uploadPictureBtn;

    @FindBy(xpath = "//span[@class='file-info']")
    public WebElement verifiesTypeOfFile;

    @FindBy(css = "ms-standard-button[icon='print']")
    public WebElement printButton;

    @FindBy(xpath = "(//button[@color='primary'])[1]")
    public WebElement uploadBtn;

    @FindBy(xpath = "(//div/button)[8]")
    public WebElement previousButton;

    @FindBy(xpath = "(//div/button)[9]")
    public WebElement todayButton;

    @FindBy(xpath = "(//div/button)[10]")
    public WebElement nextButton;

    @FindBy(xpath = "//strong[contains(text(),' Overdue ')]")
    public WebElement overdueText;

    @FindBy(xpath = "//td/div")
    public List<WebElement> lessonsButton;

    @FindBy(xpath = "//*[contains(text(),'not been started')]")
    public WebElement lessonMessage;

    @FindBy(xpath = "(//div[@fxlayoutalign.lt-md='space-between center'])[3]")
    public WebElement iconsMenu;

    @FindBy(xpath = "(//ms-icon-button[@icon='info'])[3]")
    public WebElement infoIcon;

    @FindBy(xpath = "//strong[text()='Course:']")
    public WebElement courseText;

    @FindBy(xpath = "//strong[text()='Assignment Status:']")
    public WebElement assignmentStatusText;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement descriptionText;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/button")
    public WebElement backIcon;

    @FindBy(xpath = "//div[@class='assignment ng-star-inserted']")
    public List<WebElement> assignmentsList;

    @FindBy (xpath = "//*[@class='svg-inline--fa fa-angle-down fa-fw']")
    public WebElement profileButton;

    @FindBy (xpath = "//button[.//span[text()='Settings']]")
    public WebElement settingsButton;

    @FindBy (xpath = "//*[@class='profile-image avatar huge ng-star-inserted']")
    public WebElement profilePicture;

    @FindBy (xpath = "//*[@class='mat-mdc-form-field-infix ng-tns-c508571215-36']")
    public WebElement loadButton;

    @FindBy (xpath = "//*[@class='mat-mdc-accent mdc-button mat-mdc-button mat-mdc-raised-button mat-accent mat-mdc-button-base ng-star-inserted']")
    public WebElement savePhotoButton;

    @FindBy (xpath = "//span[text()='Default Theme']")
    public WebElement theme;

    @FindBy (xpath = "//*[@value='purple-theme']")
    public WebElement purpleTheme;

    @FindBy (xpath = "//*[@class='mat-mdc-accent mdc-button mat-mdc-button mat-mdc-raised-button mat-accent mat-mdc-button-base ng-star-inserted']")
    public WebElement saveButtonTwo;

    @FindBy (xpath = "//*[@caption='NAV.GRADING.TITLE']")
    public WebElement gradingButton;

    @FindBy (id = "mat-tab-group-0-label-1")
    public WebElement studentTranscripts;

    @FindBy (id = "mat-tab-group-0-label-2")
    public WebElement transcriptSubject;

}
