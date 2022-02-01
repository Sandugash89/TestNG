package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public static void openBrowser(){
        ConfigReader.readProperties("src/Config/config.properties");
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver.exe");
                driver=new ChromeDriver();
                break;
            case"firefox":
                System.setProperty("webdriver.gecko.driver","src/Drivers/geckodriver.exe");
                driver=new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
     driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
    //post condition @Aftermethod
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
