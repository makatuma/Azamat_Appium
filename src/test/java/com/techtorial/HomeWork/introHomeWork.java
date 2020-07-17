package com.techtorial.HomeWork;

import com.techtorial.HomeWork.Pages.HomeWorkPages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class introHomeWork {

    DesiredCapabilities desiredCapabilities;
    File apkFile;
    URL url;
    AndroidDriver<AndroidElement> androidDriver;





@Before
public void setUp() throws MalformedURLException {


    apkFile = new File("src\\test\\resources\\AppiumPractice.apk");

    desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("deviceName", "Pixel 2 API 28");
    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("app", apkFile.getAbsolutePath());

    url = new URL("http://localhost:4723/wd/hub");

    androidDriver = new AndroidDriver(url, desiredCapabilities);



    AndroidElement preference= androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
    preference.click();

    AndroidElement defaultValues = androidDriver.findElement(By.xpath("\t\n" +
            "//android.widget.TextView[@content-desc=\"4. Default values\"]"));
    defaultValues.click();


}


    @Test
    public void test1(){
        AndroidElement checkBox = androidDriver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox\n"));
        checkBox.click();
    }


    @Test
    public void test2(){

      AndroidElement editText = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
      editText.click();

      AndroidElement inputBox = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText\n"));

      inputBox.clear();
      inputBox.sendKeys("Hello, Techtorial!");
    }

    @Test
    public void test3(){




     AndroidElement listPrefernces = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout"));
     listPrefernces.click();

     AndroidElement cancelBtn = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n"));
     cancelBtn.click();

}
}
