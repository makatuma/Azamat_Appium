package com.techtorial.appiumIntro.Galaxy;

import com.techtorial.appiumIntro.Pages.InstagramPage;
import com.techtorial.appiumIntro.Pages.MainPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Instagram {

    AndroidDriver<AndroidElement> driver;
    InstagramPage instagramPage;




    @Before
    public void setUp() throws MalformedURLException {

        File file = new File("src\\test\\resources\\Instagram_v150.0.0.33.120_apkpure.com.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A3 (2017)");
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, desiredCapabilities);
      instagramPage = new InstagramPage(driver);


    }

    @Test
    public void test1() {


        for (int i = 0; i < 10; i++) {
            instagramPage.messageBtn.click();
            instagramPage.searchBox.sendKeys("1kyrgyzk");
            instagramPage.clickProfile.click();
            instagramPage.messageBtn.click();
            instagramPage.typeMessage.sendKeys("Sorry, your profile is hacked from via APPIUM");
            instagramPage.sendBtn.click();


        }
    }
}
