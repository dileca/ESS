package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Login {

    WebDriver driver;


    @FindBy(id = "userName")
    WebElement userName_id;
    @FindBy(id = "password")
    WebElement password_id;
    @FindBy(id = "btnSignIn")
    WebElement signInButton_id;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String userName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(userName_id));
        userName_id.sendKeys(userName);
    }

    public void enterPassword(String password) {
        password_id.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton_id.click();
    }



}





