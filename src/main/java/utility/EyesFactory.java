package utility;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhangd on 19/04/2016.
 * <p>
 * This is an Eyes Factory
 */
public class EyesFactory {
    private static WebDriver driver = DriverFactory.getCurrentDriver();
    private static Eyes eyes;

    /**
     * Visual Validation Test with Applitools
     *
     * @param testModule test module name
     * @param length     windows length
     * @param height     windows height
     * @param pageName   name of the page
     */
    public static void visualValidation(String testModule, int length, int height, String pageName) {
        eyes = new Eyes();
        eyes.setApiKey("jchvSoCO1jn25CKaRpiVktLdrlNpX15GUQMmqDcFmRU110");
        try {
            driver = eyes.open(driver, "Applitools", testModule, new RectangleSize(length, height));

            eyes.checkWindow(pageName);

            eyes.close();

        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
