package class2;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class LoginTest extends CommonMethods {

    //test - perform login
    @Test(groups = "regression", enabled = false)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test (groups = "regression")
    public void validationOfTest(){
        String actualTitle= driver.getTitle();
        String expectingTitile="Human Management System";
        if(expectingTitile.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }

    }

}
