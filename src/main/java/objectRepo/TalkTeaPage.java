package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhangd on 4/04/2016.
 */
public class TalkTeaPage {
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[18]/div/div[1]/div[1]/input")
    public WebElement textName;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[18]/div/div[1]/div[2]/input")
    public WebElement textEmail;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[18]/div/div[1]/div[3]/input")
    public WebElement textSubject;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[18]/div/div[1]/div[4]/textarea")
    public WebElement textareaMessage;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[18]/div/div[1]/div[5]/input")
    public WebElement btnSubmit;
}
