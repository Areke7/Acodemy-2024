package Lekcija6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkSelenium extends BaseTest{

    @Test
    public void chechCorectURL() {
        driver.get("https://www.saucedemo.com/v1/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/", "Wrong URL");
    }

    private void testToLogin(String email, String password) throws InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        WebElement loginBatton = driver.findElement(By.className("btn-action"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginBatton.click();

    }

    //1.Login(tukšs, parole aizpildīta), sagaidām pareizo kļūdas paziņojumu

    @Test
    public void wrongLoginTest() throws InterruptedException {


        testToLogin("wrong.email@gmail.com", "testAlisa123");

        WebElement emailFiendInvalidMassage = driver.findElement(By.className("invalid-feedback"));
        Assert.assertEquals(emailFiendInvalidMassage.getText(), "These credentials do not match our records.", "Wrong...");
    }





}
