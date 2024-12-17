package US_7_8_9_10.StepDefinitions;

import US_7_8_9_10.Pages.DialogContent;
import US_7_8_9_10.Pages.HeaderMenu;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DataTableSteps {


    HeaderMenu hd = new HeaderMenu();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in HeaderMenu")
    public void clickOnTheElementInHeaderMenu(DataTable dtLinkler) {
        List<String> linkler = dtLinkler.asList();

        for (int i = 0; i < linkler.size(); i++) {
            hd.myClick(hd.getWebElement(linkler.get(i)));
        }
        Keys escape = Keys.ESCAPE;
    }

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialog(DataTable dtButonlar) {
        List<String> butonlar = dtButonlar.asList();

        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtKutuVeYazilar) {
        List<List<String>> kutuVeYazilar = dtKutuVeYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
            //kutuya yazıyı gönder
        }

    }
    @And("Hover over the Element in HeaderMenu")
    public void hoverOvertheElementinHeaderMenu(DataTable dtButton){
        List<String> buttons = dtButton.asList();

        for (int i = 0; i < buttons.size(); i++) {
            hd.hoverOver(hd.getWebElement(buttons.get(i)));
        }

    }
    @And("Hover over the Element in DialogContent")
    public void hoverOvertheElementinDialogContent(DataTable dtButton){
        List<String> buttons = dtButton.asList();

        for (int i = 0; i < buttons.size(); i++) {
            hd.hoverOver(dc.getWebElement(buttons.get(i)));
        }

    }

    @And("Click on the Escape Button")
    public void escapeButton(){
        Actions actions = new Actions(GWD.getDriver());

        // Send the ESCAPE key action
        actions.sendKeys(Keys.ESCAPE).perform();
    }

//    @And("User delete the element from dialog")
//    public void userDeleteTheElementFromDialog(DataTable dtSilinecekler) {
//        List<String> silinecekler = dtSilinecekler.asList();
//
//        for (int i = 0; i < silinecekler.size(); i++) {
//            dc.deleteItem(silinecekler.get(i));
//        }
//    }
}

