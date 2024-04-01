package data.pages;

import cucumber.api.java.Before;
import data.setups.InitialSetup;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SamplePage extends InitialSetup{

    @Before
    public void setup() throws Exception {
        PrepareAutomation();
    }

    public static void clickRegister(){
        driver.findElement(By.id("textViewLinkRegister")).isDisplayed();
        driver.findElement(By.id("textViewLinkRegister")).click();
    }

    public static void inputName(String name){
        driver.findElement(By.id("textInputEditTextName")).isDisplayed();
        driver.findElement(By.id("textInputEditTextName")).sendKeys(name);
    }

    public static void inputEmail(String mail){
        driver.findElement(By.id("textInputEditTextEmail")).isDisplayed();
        driver.findElement(By.id("textInputEditTextEmail")).sendKeys(mail);
    }

    public static void inputPassword(String pass){
        driver.findElement(By.id("textInputEditTextPassword")).isDisplayed();
        driver.findElement(By.id("textInputEditTextPassword")).sendKeys(pass);
    }

    public static void inputConfirmPassword(String cpass){
        driver.findElement(By.id("textInputEditTextConfirmPassword")).isDisplayed();
        driver.findElement(By.id("textInputEditTextConfirmPassword")).sendKeys(cpass);
    }

    public static void submitRegisterButton(){
        driver.findElement(By.id("appCompatButtonRegister")).isDisplayed();
        driver.findElement(By.id("appCompatButtonRegister")).click();
    }

    public static void verifySnackBarText(String result){
        String text = driver.findElement(By.id("snackbar_text")).getText();
        Assert.assertEquals(text, result,"Wrong message");
    }

    public static void verifyErrorMessage(String txt){
        String error = driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).getText();
        Assert.assertEquals(error,txt, "Wrong Error message");
    }

    public static void clickLoginButton(){
        driver.findElement(By.id("appCompatButtonLogin")).isDisplayed();
        driver.findElement(By.id("appCompatButtonLogin")).click();
    }

    public static void verifyLoginCredential(String mail){
        String cred = driver.findElement(By.id("com.loginmodule.learning:id/textViewName")).getText();
        Assert.assertEquals(cred,mail,"credential different");
    }
}
