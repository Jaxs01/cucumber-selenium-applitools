package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;

import javax.imageio.ImageIO;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by zhangd on 4/04/2016.
 */
public class PublicFunctions {
    /**
     * Capture the screen shot
     * @param driver the instance of WebDriver
     */
    public static void captureScreenShot(WebDriver driver, String testCase, String pageName) {
        try {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File(testCase + "\\" + pageName + "-" + System.currentTimeMillis() + ".jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Capture the screenshot of logo
     */
    public static void captureLogo(WebElement element, String dirLoction) {
        try {
            // Capture logo
            captureElementBitmap(element, dirLoction);
            System.out.println(element.getAttribute("alt") + "captureLogo function is correct");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(element.getAttribute("alt") + "captureLogo function is incorrect");
        }
    }


    /**
     * Capture a specific web element on the page
     * @param element WebElement user want to user
     * @param testCase test case name
     * @throws Exception exception
     */
    private static void captureElementBitmap(WebElement element, String testCase) throws Exception {
        try {
            WrapsDriver wrapsDriver = (WrapsDriver)element;
            File srcFile = ((TakesScreenshot)wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);

            // Create an instance of Buffered Image from captured screenshot
            BufferedImage img = ImageIO.read(srcFile);
            int width = element.getSize().getWidth();
            int height = element.getSize().getHeight();

            // Create a rectangle using Width and Height
            Rectangle rect = new Rectangle(width, height);
            org.openqa.selenium.Point p = element.getLocation();
            BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);

            // Write back the image data for element in File object
            ImageIO.write(dest, "jpg", srcFile);
            FileUtils.copyFile(srcFile, new File(testCase + "\\" + element.getAttribute("alt") + "-" + System.currentTimeMillis() + ".jpg"));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * Move the mouse to one specific element
     * @param driver the instance of WebDriver
     * @param element WebElement you want to hover on
     */
    public static void mouseHoverToElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
