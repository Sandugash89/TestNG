package class2;


import org.testng.annotations.*;

public class beforeSuiteAndBeforeTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before Suite");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("I am after Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after Class");
    }
    @Test(groups = "regression")
    public void regressionTest(){
        System.out.println("I am regression test");
    }
    @Test(groups = "smoke")
    public void smokeTest(){
        System.out.println("I am smoke test");
    }


}
