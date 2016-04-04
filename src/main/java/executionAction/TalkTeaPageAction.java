package executionAction;

import config._Constants;
import objectRepo.TalkTeaPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;
import utility.PublicFunctions;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhangd on 4/04/2016.
 */
public class TalkTeaPageAction {
    TalkTeaPage ttp = new TalkTeaPage();
    WebDriver driver = BrowserDriver.getCurrentDriver();

    /**
     * Constructor
     * Load the page, initiate page elements and clean files in the directory
     */
    public TalkTeaPageAction() {
        BrowserDriver.loadPage(_Constants.TalkTeaPageURL, _Constants.TalkTeaPageTitle);
        PageFactory.initElements(driver, ttp);

        // Clean previous files in the directory
        try {
            FileUtils.cleanDirectory(new File(_Constants.TalkTeaPageScreenshot));
            PublicFunctions.captureScreenShot(driver, _Constants.TalkTeaPageScreenshot, "TestCase004");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Fill in the form and submit it
     * @param name
     * @param email
     * @param subject
     * @param message
     */
    public void sendEmail(String name, String email, String subject, String message) {
        ttp.textName.sendKeys(name);
        ttp.textEmail.sendKeys(email);
        ttp.textSubject.sendKeys(subject);
        ttp.textareaMessage.sendKeys(message);
        ttp.btnSubmit.click();
    }
}
