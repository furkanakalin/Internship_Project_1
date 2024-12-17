package US_7_8_9_10.Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendKeys(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToELement(element);
        element.clear();
        element.sendKeys(value);

    }

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToELement(element);
        element.click();

    }

    public void hoverOver(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToELement(element);
        Actions actions=new Actions(GWD.getDriver());
        Action aksiyon=actions.moveToElement(element).build();
        aksiyon.perform();
    }

    public void scrollToELement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void LoginContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));


    }

}
