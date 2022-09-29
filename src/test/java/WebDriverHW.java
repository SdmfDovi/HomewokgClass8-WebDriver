import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class WebDriverHW {
    private static WebDriver driver;
    private static WebDriver driver2;


    @BeforeClass
    public static void initiateDrivers() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\doviy\\Downloads\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\doviy\\Downloads\\chromeDriver\\geckodriver.exe");
//        driver2 = new FirefoxDriver();
    }

//    @Test(priority = 1)
//    public void openWebPage(){
//        driver.get("https://www.walla.co.il");
//
//        driver2.get("https://www.ynet.co.il");
//
//    }
//    @Test(priority = 2)
//    public void navigateToGoogleTranslate(){
//               driver.navigate().to("https://translate.google.com");
//        System.out.println(driver.findElement(By.cssSelector("textarea[aria-label='Source text']")));
//    }
//    @Test(priority = 3)
//    public void firefoxNavtoYouTube(){
//        driver2.navigate().to("https://www.youtube.com");
//        System.out.println(driver2.findElement(By.id("logo-icon")));
//    }
//    @Test(priority = 4)
//    public void firefoxSeleniumTextBox(){
//        driver2.navigate().to("https://www.seleniumhq.org");
//        System.out.println(driver2.findElement(By.className("DocSearch-Button-Container")));
//        WebElement element = driver2.findElement(By.className("DocSearch-Button-Container"));
//        element.click();
//        element = driver2.findElement(By.id("docsearch-input"));
//        element.sendKeys("selenium");
//        //element.sendKeys("selenium");
//        driver.close();
//        driver2.close();
//    }
//    @Test(priority = 5)
//    public void chromeAmazonTitleAssertion(){
//        driver.navigate().to("https://www.amazon.com");
//        String expectedTitle="Amazon.com. Spend less. Smile more.";
//        Assert.assertEquals(expectedTitle, driver.getTitle());
//
//    }
//    @Test
//    public void chromeAmazonSearch(){
//        driver.navigate().to("https://www.amazon.com");
//    WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
//    element.sendKeys("Leather Shoes");
//    element=driver.findElement(By.id("nav-search-submit-button"));
//    element.click();
//    }
//    @Test
//    public void writeHebrew(){
//        driver.navigate().to("https://translate.google.com");
//        WebElement element= driver.findElement(By.cssSelector("textarea[aria-label='Source text']"));
//        element.sendKeys("שלום");
//        driver.close();
//    }
//    @Test
//    public void youtubeSearch(){
//        driver.navigate().to("https://www.youtube.com");
//        WebElement element = driver.findElement(By.name("search_query"));
//        element.sendKeys("Ozzy");
//        element = driver.findElement(By.id("search-icon-legacy"));
//        element.click();
//    }

//    @Test
//    public void facebookLogin(){
//    driver.navigate().to("https:www.facebook.com");
//    WebElement element= driver.findElement(By.name("email"));
//   element.sendKeys("UserEmail");
//   element=driver.findElement(By.name("pass"));
//   element.sendKeys("UserPassword");
//   element.submit();
//    }
    @Test
    public void javaScriptExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.amazon.com");


        js.executeScript("document.getElementById('twotabsearchtextbox').value='ozzy';");
        js.executeScript("document.getElementById('nav-search-submit-button').click();");

    }
    //10 it is possible using cross browser testing  and threads TestNG can do it using /xml file

}