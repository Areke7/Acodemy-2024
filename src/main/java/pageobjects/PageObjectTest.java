package pageobjects;

import Lekcija6.QaProjectBaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTest extends QaProjectBaseTest {
    WebDriver driver;

    @Test
    public void chechAllElementsonLandingPage(){


        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        Assert.assertEquals(qaProjectLandingPage.chechIfElementsExistOnPage(), true);


    }

    @Test
    public void chechRegisterLandingPage(){

    }

    @Test
    public void testSuccessfulRegistration() throws InterruptedException {
        Faker faker = new Faker();
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();

        QaProjectRegisterPage qaProjectRegisterPage = new QaProjectRegisterPage(driver);
        qaProjectRegisterPage.birthDateField.sendKeys("01/26/1990");
        qaProjectRegisterPage.nameInputField.sendKeys("Juris");
        qaProjectRegisterPage.lastNameInputField.sendKeys("Kreilis");
        qaProjectRegisterPage.emailInputField.sendKeys("juriskreilis123123@gmail.com");
        qaProjectRegisterPage.confirmEmailInputField.sendKeys("juriskreilis123123@gmail.com");
        qaProjectRegisterPage.passwordInputField.sendKeys("parole123");
        qaProjectRegisterPage.confirmPasswordInputField.sendKeys("parole123");
        qaProjectRegisterPage.termsAndConditionsCheckbox.click();
        qaProjectRegisterPage.submitButton.click();
        Thread.sleep(5000);
    }
}
