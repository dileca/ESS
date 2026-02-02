package Tests;

import Pages.Login;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

        final WebDriver driver = browserFactory.startBrowser("chrome", "https://sage.qa.bltelecoms.net/WebSelfService#/signin");
        Login login = PageFactory.initElements(driver, Login.class);
}
