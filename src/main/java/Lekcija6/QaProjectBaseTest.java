package Lekcija6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class QaProjectBaseTest {
    WebDriver driver;

    //@ BeforeMethod un @AfterMethod pielietojas pie visiem testiem kuri seit tiek veikti
    @BeforeMethod
    public void setUpBrowser(){
        driver = new ChromeDriver();
        // cil ilgi gaidīs uz konkreto elementu lapā, ja nu kaut kas lādesies ilgak - implicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get("https://qaproject.acodemy.lv/");

    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
