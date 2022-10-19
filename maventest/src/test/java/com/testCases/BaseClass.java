package com.testCases;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;




public class BaseClass {

    public String baseURL="https://www.cubefunder.com/apply";
    public String full_name="Automated Generated";
    public String email="autog10@gmail.com";
    public String mobile="03445552991";
    public String dob="10/03/1995";
    public String bank="HBL";
    public String businessname="HBL ASSOCIATES HOLDINGS LIMITED";
    public static WebDriver driver;
   
    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
    
   
    // @AfterClass
    // public static void tearDown()
    // {
    //    driver.quit();
    // }
    
}


