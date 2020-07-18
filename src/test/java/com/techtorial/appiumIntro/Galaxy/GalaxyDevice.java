package com.techtorial.appiumIntro.Galaxy;

import com.techtorial.appiumIntro.Pages.ContentPage;
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

public class GalaxyDevice {


    AndroidDriver <AndroidElement> driver;
    MainPage mainPage;
    ContentPage contentPage;


    @Before
    public void setUp() throws MalformedURLException {

        File file = new File("src\\test\\resources\\AppiumPractice.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A3 (2017)");
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(url, desiredCapabilities);

        mainPage = new MainPage(driver);
        contentPage = new ContentPage((driver));
    }

    @Test
    public void test1(){

        mainPage.content.click();
        contentPage.assets.click();
        driver.navigate().back();
        contentPage.clipBoard.click();
        driver.navigate().back();
        contentPage.Packages.click();
        driver.navigate().back();
        contentPage.provider.click();
        driver.navigate().back();
        contentPage.resources.click();
        driver.navigate().back();
        contentPage.storage.click();


    }
}
