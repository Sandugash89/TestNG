package class2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Priority extends CommonMethods {



        //test - perform login
        @Test(priority = 2)
        public void adminLogin(){
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("12345");
            driver.findElement(By.id("btnLogin")).click();
        }
        //post condition @Aftermethod

        @Test(priority = 1)
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

