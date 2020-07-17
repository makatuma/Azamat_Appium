package com.techtorial.appiumIntro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class AppiumIntro1 {

@Test
    public void intro1() {
    File apkFile = new File("src\\test\\resources\\AppiumPractice.apk");

    DesiredCapabilities    desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("deviceName", "Pixel 2 API 28");
    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("app", apkFile.getAbsolutePath());


    URL url;

    try {
        url = new URL("http://localhost:4723/wd/hub");
    }catch (MalformedURLException e){
        throw  new RuntimeException(e);

    }

    AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(url, desiredCapabilities);
    AndroidElement element= androidDriver.findElement(By.xpath("\t\n" +
            "//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]"));

    element.click();

}

}
