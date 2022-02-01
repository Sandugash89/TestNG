package class2;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void login(){
        System.out.println("Test");
    }
    @Test(dependsOnMethods = "login")
public void verificationofDashboard(){
        System.out.println("I am dependent ");
    }
}
