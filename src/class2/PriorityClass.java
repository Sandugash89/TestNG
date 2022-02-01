package class2;

import org.testng.annotations.Test;

public class PriorityClass {
    @Test(priority = 2,enabled = false)
    public void firstTest(){
        System.out.println("I am first test");
    }
    @Test(priority = 3)
    public void secondTest(){

        System.out.println("I am second test");
    }
    @Test(priority = 1)
    public void thirdTest(){
        System.out.println("I am third test");
    }
}
