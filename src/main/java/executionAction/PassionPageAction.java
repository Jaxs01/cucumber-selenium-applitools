package executionAction;

import config._Constants;
import objectRepo.PassionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;
import utility.EyesFactory;

/**
 * Created by zhangd on 4/04/2016.
 */
public class PassionPageAction {
    PassionPage pp = new PassionPage();
    WebDriver driver = DriverFactory.getCurrentDriver();

    /**
     * Constructor
     * Load the page, initiate page elements and clean files in the directory
     */
    public PassionPageAction() {
        DriverFactory.loadPage(_Constants.PassionPageURL, _Constants.PassionPageTitle);
        PageFactory.initElements(driver, pp);
    }

    /**
     * Visual Validation Tests
     */
    public void eyesTest() {
        EyesFactory.visualValidation("PassionTea - Passion", 1920, 1080, _Constants.PassionPageTitle);
    }
}
