package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/direver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amaazon.com");
        /*
        ilerde wait konusunu daha geniş olarak ele alacağız
        bir sayfa açılırken ilk başta sayfanın içerisinde bulunan elementlere göre bir yüklennme dsyfsdıns ihtiyaç vardır.

         */

        driver.close();
    }
}
