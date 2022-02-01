package class2;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(enabled = true)
    public void firstTest(){
        System.out.println("I am first test");
    }
    @Test(enabled = false)
    public void secondTest(){

        System.out.println("I am second test");
    }
    @Test(enabled = true)
    public void thirdTest(){
        System.out.println("I am third test");
    }
}
