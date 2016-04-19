package executionAction;

import config._Constants;
import objectRepo.WelcomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;
import utility.EyesFactory;

/**
 * Created by zhangd on 4/04/2016.
 */
public class WelcomePageAction {
    WelcomePage wp = new WelcomePage();
    WebDriver driver = DriverFactory.getCurrentDriver();

    /**
     * Constructor
     * Load the page, initiate page elements and clean files in the directory
     */
    public WelcomePageAction() {
        DriverFactory.loadPage(_Constants.WelcomePageURL, _Constants.WelcomePageTitle);
        PageFactory.initElements(driver, wp);
    }

    /**
     * Assert if navigation bar's link and text are correct
     */
    public void assertWelcomePageLink() {
        try {
            // Assert link
            Assert.assertEquals(_Constants.BaseURL + "welcome.html", wp.navbarWelcome.getAttribute("href"));
            Assert.assertEquals(_Constants.BaseURL + "our-passion.html", wp.navbarPassion.getAttribute("href"));
            Assert.assertEquals(_Constants.BaseURL + "menu.html", wp.navbarMenu.getAttribute("href"));
            Assert.assertEquals(_Constants.BaseURL + "let-s-talk-tea.html", wp.navbarTalkTea.getAttribute("href"));
            Assert.assertEquals(_Constants.BaseURL + "check-out.html", wp.navbarCheckOut.getAttribute("href"));

            // Assert text
            Assert.assertEquals("Welcome", wp.navbarWelcome.getText());
            Assert.assertEquals("Our Passion", wp.navbarPassion.getText());
            Assert.assertEquals("Menu", wp.navbarMenu.getText());
            Assert.assertEquals("Let's Talk Tea", wp.navbarTalkTea.getText());
            Assert.assertEquals("Check Out", wp.navbarCheckOut.getText());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * Visual Validation Tests
     */
    public void eyesTest() {
        EyesFactory.visualValidation("PassionTea - Welcome", 1920, 1080, _Constants.WelcomePageTitle);
    }
}
