package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HardAssortion extends CommonMethods {

    @Test
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();
        String expectingTitle = "Human Maaaaaaaaaaaaaaaanagement System";
        Assert.assertEquals(actualTitle, expectingTitle);

        WebElement username = driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("I am test code");

       /* if(expectingTitile.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }*/

        WebDriver driver;
    }
    }



