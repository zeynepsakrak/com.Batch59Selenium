package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
1- amazon.com'a gidip arama kutusunu locate edin
2- arama kutusunun tagName'inin input oldugunu test edin
3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
 */
        System.setProperty("webdriver.chrome.driver","src/main/resources/direver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //2- arama kutusunun tagName'inin input oldugunu test edin
        String expectedTagname="input";
        String actualTagName= aramaKutusu.getTagName();
        if (expectedTagname.equals(actualTagName)){
        System.out.println("tagname testi PASSED ");
    }else{
            System.out.println("tagname testi FAİLED");
        }
        //3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
        String expectedNameDegeri="field-keywords";
        String actualNameDegeri= aramaKutusu.getAttribute("name");
        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("Attribute testi PASSED ");
        }else{
            System.out.println("Attribute testi FAİLED");
        }
        driver.close();
}}
