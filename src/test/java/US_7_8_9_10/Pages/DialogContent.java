package US_7_8_9_10.Pages;

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

    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button/span[text()]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='logo-text ng-star-inserted']")
    public WebElement entryText;

//Messaging menu


//    public void verifyMessageContainsText(String value){
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
//        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
//
//        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
//        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
//    }
//
//    public void deleteItem(String deleteName)
//    {
//        mySendKeys(searchInput,deleteName);
//        myClick(searchButton);
//
//        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
//        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
//
//        myClick(deleteImageBtn);
//        myClick(deleteDialogBtn);
//    }


    // send message part
    @FindBy(xpath = "//ms-button[@tooltip]/button")
    public WebElement addReceiver;

    @FindBy(xpath = "(//div[@class='mdc-checkbox']/input[@type='checkbox'])[1]")
    public WebElement checkbox1st;

    @FindBy(xpath = "(//ms-button[@color='accent']/button)[3]")
    public WebElement add_Close;

    @FindBy(xpath = "//mat-select/div")
    public WebElement selectMessagetype;

    @FindBy(xpath = "(//mat-pseudo-checkbox)[1]")
    public WebElement emailCheckbox;

    @FindBy(xpath = "//ms-text-field/input")
    public WebElement subject;

    @FindBy(xpath = "//body/p")
    public WebElement textArea;

    // userstory 6-7

    @FindBy(xpath = "(//ms-button[@color='accent']/button)[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//mat-panel-description/div")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@placeholder='Name, Username or E-mail']")
    public WebElement placeholder;

    @FindBy(xpath = "(//ms-confirm-button/button)[4]")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//ms-delete-button/button)[4]")
    public WebElement deleteTrash;


    @FindBy(xpath = "(//mat-dialog-actions//button)[1]")
    public WebElement yesButton;

    @FindBy(xpath = "(//ms-standard-button/button)[4]")
    public WebElement recover;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    // userstory 8
    @FindBy(xpath = "//label[text()='Stripe ']")
    public  WebElement radiobtf;

    @FindBy(xpath = "//label/span[text()='Pay in full $5,000.00 at once.']")
    public  WebElement radiobts;

    @FindBy(xpath = "//label/span[text()='Pay']")
    public  WebElement radiobtt;

    @FindBy(xpath = "//mat-radio-group/div")
    public WebElement space;

    @FindBy(xpath = "//ms-currency-field/input")
    public WebElement amount;

    @FindBy(xpath = "//div[@class='p-CardNumberInput']/div/input")
    public WebElement cardNumber;

    @FindBy(xpath = "//div[@class='p-Input']/input[@name='expiry']")
    public WebElement expiry;

    @FindBy(xpath = "//div[@class='p-Input']/input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//form[@id='payment-form']/button")
    public WebElement payment;

    @FindBy(xpath = "//ms-button/button")
    public WebElement payButton;

    @FindBy(xpath = "//ms-standard-button/button")
    public WebElement eyeButton;

    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.successMessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "addReceiver": return this.addReceiver;
            case "checkbox1st": return this.checkbox1st;
            case "addClose": return this.add_Close;
            case "selectMessagetype": return this.selectMessagetype;
            case "email": return this.emailCheckbox;
            case "subject": return this.subject;
            case "textArea": return this.textArea;
            case "sendButton": return this.sendButton;
            case "placeholder": return this.placeholder;
            case "delete": return this.deleteIcon;
            case "yesButton": return this.yesButton;
            case "recover": return this.recover;
            case "trashIcon": return this.deleteTrash;
            case "submit": return this.submit;
            case "radiobtf": return this.radiobtf;
            case "radiobts": return this.radiobts;
            case "radiobtt": return this.radiobtt;
            case "amount": return this.amount;
            case "pay": return this.payButton;
            case "eyeButton": return this.eyeButton;

        }

        return null;
    }


}

