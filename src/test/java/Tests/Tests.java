package Tests;


import org.testng.annotations.Test;

public class Tests extends Base {

    @Test
    public void LoginTest() throws InterruptedException {
        login.enterUsername("Test002");
        login.enterPassword("Password@1");
        login.clickSignInButton();
    }

}
