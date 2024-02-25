package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaProjectLandingPage {

    WebDriver driver;

    @FindBy(xpath="//div[contains(@class,'top-0')]/a")
    WebElement homeLink;

    @FindBy(xpath="//div[contains(@class,'top-0')]/a[text()='Login']")
    WebElement loginLink;

    @FindBy(xpath="//div[contains(@class,'top-0')]/a[text()='Register']")
    public WebElement registerLink;

    @FindBy(xpath="//div[@class='flex items-center']//a")
    WebElement QApostLink;

    public QaProjectLandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean chechIfElementsExistOnPage(){
        return QApostLink.isDisplayed() && loginLink.isDisplayed() && registerLink.isDisplayed();
    }



}
