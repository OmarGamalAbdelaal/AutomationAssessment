import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import okhttp3.*;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AppAutomation {
   AndroidDriver <AndroidElement> driver;
    AndroidTouchAction actions;
     public void openapp () throws MalformedURLException {
             DesiredCapabilities cap = new DesiredCapabilities();
             cap.setCapability("deviceName", "Omar's A51");
             cap.setCapability("udid", "RZ8MC0KB75W");
             cap.setCapability("platformName", "Android");
             cap.setCapability("app","D:\\Semary\\Smiles_Sprint132_DEV_164_Automation.apk");
             cap.setCapability("appWaitPackage", "882a369 u0 ae.etisalat.smiles");
             cap.setCapability("appWaitActivity", "ae.etisalat.smiles.login.ui.login.LoginActivity");
             cap.setCapability("uiautomator2ServerInstallTimeout", "25000");
             cap.setCapability("appWaitForLaunch", "false");
             cap.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver<AndroidElement>(new URL("localhost/wd/hub/7432"),cap);

     }

     public void login() throws IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         AndroidElement SkipBtn =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
         SkipBtn.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         AndroidElement phoneNumber = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
         phoneNumber.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         Actions action = new Actions(driver);
         action.sendKeys("543938266").perform();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement sendCodeBtn = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView");
         sendCodeBtn.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement otp = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
         otp.click();
         action.sendKeys("786786").perform();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement explore = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Explore all\"]");
         explore.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


         int scrollStart = 50 ;
         int scrollEnd = 100;

         AndroidTouchAction actions = new AndroidTouchAction(driver)
                 .press(PointOption.point(0, scrollStart))
                 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                 .moveTo(PointOption.point(0, scrollEnd))
                 .release()
                 .perform();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement devices = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[14]");
         devices.click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement samsung = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]");
         samsung.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement buyNowBtn = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView");
         buyNowBtn.click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         AndroidElement nextBtn = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button");
         nextBtn.click();

         OkHttpClient client = new OkHttpClient().newBuilder()
                 .build();
         MediaType mediaType = MediaType.parse("text/plain");
         RequestBody body = RequestBody.create(mediaType, "");
         Request request = new Request.Builder()
                 .url("https://www.etisalat.ae/b2c/eshop/getDeviceSku/bgSku3804197268")
                 .method("GET", body)
                 .addHeader("ADRUM", "isAjax:true")
                 .addHeader("Accept", "application/json, text/plain, */*")
                 .addHeader("Accept-Language", "en-US,en;q=0.9")
                 .addHeader("Cache-Control", "no-cache")
                 .addHeader("Channel", "Portal")
                 .addHeader("Connection", "keep-alive")
                 .addHeader("Cookie", "s_ips=639; s_tp=3971; s_ppv=en-ae:www.etisalat.ae:viewproducts,21,16,847,1,6;; B2CJSESSIONID=kzcYpPp0PH5MeJxLvopurKN05nqWSeayokKDVWAtdV2h6mKah2--!-817767056; CMS-cookie=3297682954.47873.0000; TS0196bc3e=012b7f183ca530c014fa73db94a4e0a41c552cee09ef7a97f988ae1078aa293e6d6256671459121b7cbc426c30e4c778f2a826d4cf; stickounet=1709810450.01.2452.612387|4fe03ee20755f06e315b25ff822079bb")
                 .addHeader("49c8-8de6-16fae51c7d0a|n", "customer1_8330acca-5d30-48e6-8384-57b66386c1ba;")
                 .addHeader("If-Modified-Since", "0")
                 .addHeader("Locale", "en_AE")
                 .addHeader("Referer", "https://www.etisalat.ae/b2c/eshop/deviceconfiguration?")
                 .addHeader("Sec-Fetch-Dest", "empty")
                 .addHeader("Sec-Fetch-Mode", "cors")
                 .addHeader("Sec-Fetch-Site", "same-origin")
                 .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)")
                 .addHeader("X-CSRF-TOKEN", "c769915a-92f7-4e89-9220-cb7569411430")
                 .addHeader("isloggedin", "null")
                 .addHeader("sec-ch-ua", "\"Chromium\";v=\"122\", \"Not(A:Brand\";v=\"24\", \"Google Chrome\";v=\"122\"")
                 .addHeader("sec-ch-ua-mobile", "?0")
                 .addHeader("sec-ch-ua-platform", "\"Windows\"")
                 .build();
         Response response = client.newCall(request).execute();


         double actual = 5099.0;

         Assert.assertEquals(response, actual);

     }
}
