package Lekcija6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest extends BaseTest{
    // ar extends mēs pievienojām kur tagad ir definēts driveer


    @Test
    public void myFirstSeleniumTest() throws InterruptedException {
        //driver ir objekts, kurs kontrolēs pārlūkprogrammas
        //atveram parlūkprogrammu
        //driver = new ChromeDriver();

        //atver konkretu majaslapu
        driver.get("http://google.com");

        Thread.sleep(5000);

        //aizveram pārlūkprogrammu
        //driver.close();

    }
    @Test
    public void checkPageTitleTest(){

        driver.get("https://acodemy.lv/lv");
        Assert.assertEquals(driver.getTitle(),"IT курсы в Риге","Wrong page title");

    }
    // uzraksti testu, kurš pārbauda vai URL ir pareizs

    @Test
    public void chechUrlCorect(){
        //aizej us kādu saiti
        driver.get("https://acodemy.lv/lv");
        //raksti assert parbaudot vai URL sakrīt ar to kuru iekopējat
        Assert.assertEquals(driver.getCurrentUrl(),"https://acodemy.lv/lv","Wrong URL");
    }


}
