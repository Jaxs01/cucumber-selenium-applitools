package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhangd on 4/04/2016.
 */
public class WelcomePage {
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[13]/div/ul/li[1]/a")
    public WebElement navbarWelcome;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[13]/div/ul/li[2]/a")
    public WebElement navbarPassion;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[13]/div/ul/li[3]/a")
    public WebElement navbarMenu;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[13]/div/ul/li[4]/a")
    public WebElement navbarTalkTea;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[13]/div/ul/li[5]/a")
    public WebElement navbarCheckOut;
}
