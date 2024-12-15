package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends ParentPage{

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//button[contains(@class, 'mat-mdc-button-wrapper')]")
    public WebElement calender;

    public WebElement getWebElement(String strElementName){

        switch (strElementName)
        {
            case "calender" : return this.calender;
        }

        return null;
    }
}
