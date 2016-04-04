package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhangd on 4/04/2016.
 */
public class MenuPage {
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[16]/div/a/span")
    public WebElement btnCheckOutGreenTea;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[15]/div/a/span")
    public WebElement btnCheckOutRedTea;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[27]/div/a/span")
    public WebElement btnCheckOutOolongTea;
}
