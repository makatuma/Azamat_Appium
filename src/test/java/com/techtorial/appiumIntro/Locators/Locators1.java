package com.techtorial.appiumIntro.Locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Locators1 {

    AndroidDriver <AndroidElement> androidDriver;

    @Before
    public void setUp() throws MalformedURLException {

        File file = new File("src\\test\\resources\\AppiumPractice.apk");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel 2 API 28");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("newCommandTime", "600");
        desiredCapabilities.setCapability("app", file.getAbsolutePath());

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver(serverUrl, desiredCapabilities);
    }


    @Test
    public void loc1(){

         AndroidElement views = androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
         views.click();
    }


    @Test
    public void loc2(){


        AndroidElement views = androidDriver.findElement(By.id("android:id/text1"));
        views.click();

    }

    @Test
    public void loc3(){

    //accessibilityId

        AndroidElement app =  androidDriver.findElementByAccessibilityId("App");
        app.click();

    }



    @Test
    public void loc4(){

        AndroidElement content = androidDriver.findElementByAndroidUIAutomator("text(\"Content\")");
        content.click();


        AndroidElement storage = androidDriver.findElementByAndroidUIAutomator("text(\"Storage\")");
        storage.click();

        AndroidElement   externalStorage = androidDriver.findElementByAndroidUIAutomator("text(\"External Storage\")");

        externalStorage.click();

       AndroidElement delete = androidDriver.findElementByAndroidUIAutomator("text(\"DELETE\")");
        Assert.assertTrue(delete.isEnabled()==false);



    }



}
