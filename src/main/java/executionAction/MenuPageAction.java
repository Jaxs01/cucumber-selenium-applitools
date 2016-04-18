package executionAction;

import config._Constants;
import objectRepo.MenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;

/**
 * Created by zhangd on 4/04/2016.
 */
public class MenuPageAction {
    MenuPage mp = new MenuPage();
    WebDriver driver = DriverFactory.getCurrentDriver();

    /**
     * Constructor
     * Load the page, initiate page elements and clean files in the directory
     */
    public MenuPageAction() {
        DriverFactory.loadPage(_Constants.MenuPageURL, _Constants.MenuPageTitle);
        PageFactory.initElements(driver, mp);
    }

    /**
     * Check out one type of tea
     * @param teaType
     */
    public void clickCheckOut(String teaType) {
        switch (teaType) {
            case "Green Tea":
                mp.btnCheckOutGreenTea.click();
                break;
            case "Red Tea":
                mp.btnCheckOutRedTea.click();
                break;
            case "Oolong Tea":
                mp.btnCheckOutOolongTea.click();
                break;
        }
    }
}
