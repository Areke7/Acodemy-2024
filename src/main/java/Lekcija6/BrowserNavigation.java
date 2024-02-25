package Lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserNavigation extends BaseTest{

    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("https://www.1a.lv/");

                WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();
                //back
        driver.navigate().back();

            //Forward
        driver.navigate().forward();

            //
        driver.navigate().refresh();

        Thread.sleep(6000);

    }

    @Test
    public void testAcceptCoociesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement acceptCoociesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertTrue(cookieBanner.isDisplayed(), "Coocie banner is not displayed");
        ;
        System.out.println(cookieBanner.getTagName());

        cookieBanner.click();

        Assert.assertFalse(cookieBanner.isDisplayed(), "Coocie banner is displayed");

        System.out.println("Hello World");

        Thread.sleep(6000);

    }
    @Test
    public void testAttributeIn1a(){
        driver.get("https://www.1a.lv/");
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertEquals(cookieBanner.getAttribute("lang"),"lv");

        //li[contains(@class,'language-switcher')]/a[text()='LV']

    }

    @Test
    public void test220lv(){
    driver.get("https://www.1a.lv/");
    WebElement coocieBlock = driver.findElement(By.id("cookie_block"));

    }

}
