package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class SoftAssertion extends CommonMethods {

    @Test(groups = "regression")
    public void verifyAndValidateSoftAssertion() {
        SoftAssert soft = new SoftAssert();
        String actualTitle = driver.getTitle();
        String expectingTitle = "Human Maaaaaaaaaaaaaaaanagement System";
        soft.assertEquals(actualTitle, expectingTitle);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();


        WebElement welcomeText = driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
        soft.assertTrue(welcomeText.isDisplayed());
        System.out.println("I am still executing even after failing the test above");

        soft.assertAll(); // should be the last line of test case
    }
}
