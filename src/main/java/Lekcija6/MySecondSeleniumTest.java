package Lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MySecondSeleniumTest  extends BaseTest{

    private void attemptToLogin(String email, String password) throws InterruptedException {
        driver.get("https://qaproject.acodemy.lv/login");

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        WebElement loginBatton = driver.findElement(By.className("btn-primary"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginBatton.click();

    }

    @Test
    public void successFullLoginTest() throws InterruptedException {

        attemptToLogin("emilysinclair@gmail.com", "qwerty123456#");

        WebElement nameDropDown = driver.findElement(By.id("navbarDropdown"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaproject.acodemy.lv/home", "User is not navigated to home page URL");
        //System.out.println(nameDropDown.getText()); - 1.varinats kā parbaudījam vai tiešam ielogojas
        Assert.assertEquals(nameDropDown.getText(), "Emily", "Wrong...");
    }

    @Test
    public void wrongLoginTest() throws InterruptedException {


        attemptToLogin("wrong.email@gmail.com", "testAlisa123");

        WebElement emailFiendInvalidMassage = driver.findElement(By.className("invalid-feedback"));
        Assert.assertEquals(emailFiendInvalidMassage.getText(), "These credentials do not match our records.", "Wrong...");
    }

    @Test
   public void emptyPasswordLoginFieldTest() throws InterruptedException {
        attemptToLogin("wrong.email@gmail.com", "");
    }



}
