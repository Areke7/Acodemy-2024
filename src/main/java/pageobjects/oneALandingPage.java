package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class oneALandingPage {

    private final WebDriver driver;
    WebDriver drover;

    public oneALandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        // public void switchLanguage(String"language"){
          //  driver.findElement(By.xpath("//li[contains(@class,'language-switcher')]/a[text()='" + language + "']")).click();

        //List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));
        //languageElements.get(1).click();

        }


    }
