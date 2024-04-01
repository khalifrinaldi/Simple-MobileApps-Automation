package data.setups;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class InitialSetup {

    public static AndroidDriver driver;

    public static void PrepareAutomation() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.UDID, "Your device UDID");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Your Android version");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, "(your path)/Simple_Test_Automation/apps/SampleAndroidApp.apk");
        capabilities.setCapability("appPackage", "com.loginmodule.learning");
        capabilities.setCapability("appActivity", "com.loginmodule.learning.activities.LoginActivity");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
